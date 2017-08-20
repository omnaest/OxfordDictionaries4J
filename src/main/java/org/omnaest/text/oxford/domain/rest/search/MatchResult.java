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
package org.omnaest.text.oxford.domain.rest.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchResult
{
	@JsonProperty
	private String	id;
	@JsonProperty
	private String	region;
	@JsonProperty
	private String	word;
	@JsonProperty
	private String	matchForm;
	@JsonProperty
	private String	matchString;
	@JsonProperty
	private String	matchType;

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getRegion()
	{
		return this.region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public String getWord()
	{
		return this.word;
	}

	public void setWord(String word)
	{
		this.word = word;
	}

	public String getMatchForm()
	{
		return this.matchForm;
	}

	public void setMatchForm(String matchForm)
	{
		this.matchForm = matchForm;
	}

	public String getMatchString()
	{
		return this.matchString;
	}

	public void setMatchString(String matchString)
	{
		this.matchString = matchString;
	}

	public String getMatchType()
	{
		return this.matchType;
	}

	public void setMatchType(String matchType)
	{
		this.matchType = matchType;
	}

}
