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
public class SenseEntry
{
	@JsonProperty
	private String id;

	@JsonProperty
	private List<SynonymEntry> synonyms;

	@JsonProperty
	private List<SenseEntry> subsenses;

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public List<SynonymEntry> getSynonyms()
	{
		return this.synonyms;
	}

	public void setSynonyms(List<SynonymEntry> synonyms)
	{
		this.synonyms = synonyms;
	}

	public List<SenseEntry> getSubsenses()
	{
		return this.subsenses;
	}

	public void setSubsenses(List<SenseEntry> subsenses)
	{
		this.subsenses = subsenses;
	}

}
