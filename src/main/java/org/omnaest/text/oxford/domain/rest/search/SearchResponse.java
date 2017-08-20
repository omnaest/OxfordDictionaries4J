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

import java.util.List;

import org.omnaest.text.oxford.domain.rest.common.MetaData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse
{
	@JsonProperty
	private MetaData metadata;

	@JsonProperty
	private List<MatchResult> results;

	public List<MatchResult> getResults()
	{
		return this.results;
	}

	public void setResults(List<MatchResult> results)
	{
		this.results = results;
	}

	public MetaData getMetadata()
	{
		return this.metadata;
	}

	public void setMetadata(MetaData metadata)
	{
		this.metadata = metadata;
	}

}
