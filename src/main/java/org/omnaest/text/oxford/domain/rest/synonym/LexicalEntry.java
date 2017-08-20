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
public class LexicalEntry
{
	@JsonProperty
	private String	language;
	@JsonProperty
	private String	lexicalCategory;
	@JsonProperty
	private String	text;

	@JsonProperty
	private List<Entry> entries;

	public String getLanguage()
	{
		return this.language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public String getLexicalCategory()
	{
		return this.lexicalCategory;
	}

	public void setLexicalCategory(String lexicalCategory)
	{
		this.lexicalCategory = lexicalCategory;
	}

	public String getText()
	{
		return this.text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public List<Entry> getEntries()
	{
		return this.entries;
	}

	public void setEntries(List<Entry> entries)
	{
		this.entries = entries;
	}

}
