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
package org.omnaest.text.oxford.domain.rest.synonym;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SynonymResult
{
	@JsonProperty
	private String	id;
	@JsonProperty
	private String	language;
	@JsonProperty
	private String	type;
	@JsonProperty
	private String	word;

	@JsonProperty
	private List<LexicalEntry> lexicalEntries;

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getLanguage()
	{
		return this.language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public String getType()
	{
		return this.type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getWord()
	{
		return this.word;
	}

	public void setWord(String word)
	{
		this.word = word;
	}

	public List<LexicalEntry> getLexicalEntries()
	{
		return this.lexicalEntries;
	}

	public void setLexicalEntries(List<LexicalEntry> lexicalEntries)
	{
		this.lexicalEntries = lexicalEntries;
	}

}
