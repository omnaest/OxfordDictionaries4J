/*

	Copyright 2017 Danny Kunz

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.


*/
package org.omnaest.text.oxford;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;

public class OxfordUtils
{
	public static interface OxfordInstance
	{
		public OxfordInstance setLanguage(String language);

		public Stream<Match> searchFor(String word);

		public Stream<Match> searchFor(String... words);
	}

	public static interface Match
	{
		public List<String> findSynonyms();

		public String getWordId();

		public String getWord();
	}

	public static OxfordInstance getInstance(String appId, String appKey)
	{
		return new OxfordInstance()
		{
			private String language = "en";

			@Override
			public OxfordInstance setLanguage(String language)
			{
				this.language = language;
				return this;
			}

			@Override
			public Stream<Match> searchFor(String... words)
			{
				return Arrays	.asList(words)
								.stream()
								.distinct()
								.flatMap(word -> this.searchFor(word));
			}

			@Override
			public Stream<Match> searchFor(String word)
			{
				return OxfordRestUtils	.searchFor(word, this.language, appId, appKey)
										.getResults()
										.stream()
										.filter(match -> StringUtils.equalsIgnoreCase(word, match.getWord()))
										.map(match -> this.createMatchFor(match.getId(), match.getWord()));
			}

			private Match createMatchFor(String wordId, String word)
			{
				return new Match()
				{
					@Override
					public List<String> findSynonyms()
					{
						try
						{
							return OxfordRestUtils	.getSynonym(wordId, language, appId, appKey)
													.getResults()
													.stream()
													.flatMap(result -> result	.getLexicalEntries()
																				.stream())
													.flatMap(entry -> entry	.getEntries()
																			.stream())
													.flatMap(entry -> entry	.getSenses()
																			.stream())
													.flatMap(sense -> sense	.getSynonyms()
																			.stream())
													.map(synonym -> synonym.getText())
													.collect(Collectors.toList());
						}
						catch (Exception e)
						{
							return Collections.emptyList();
						}
					}

					@Override
					public String getWordId()
					{
						return wordId;
					}

					@Override
					public String getWord()
					{
						return word;
					}
				};
			}

		};
	}
}
