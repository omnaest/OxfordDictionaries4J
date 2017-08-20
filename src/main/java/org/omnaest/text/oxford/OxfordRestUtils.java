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

import java.util.HashMap;
import java.util.Map;

import org.omnaest.text.oxford.domain.rest.search.SearchResponse;
import org.omnaest.text.oxford.domain.rest.synonym.SynonymsResponse;
import org.omnaest.utils.rest.client.JSONRestClient;
import org.omnaest.utils.rest.client.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OxfordRestUtils
{
	private static final Logger LOG = LoggerFactory.getLogger(OxfordRestUtils.class);

	public static SynonymsResponse getSynonym(String wordId, String language, String appId, String appKey)
	{
		RestClient restClient = new JSONRestClient();
		String url = "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + language + "/" + wordId + "/synonyms";
		LOG.info("Request url: " + url);
		Map<String, String> headers = new HashMap<>();
		headers.put("app_id", appId);
		headers.put("app_key", appKey);
		return restClient.requestGet(url, SynonymsResponse.class, headers);
	}

	public static SearchResponse searchFor(String word, String language, String appId, String appKey)
	{
		RestClient restClient = new JSONRestClient();
		String url = "https://od-api.oxforddictionaries.com:443/api/v1/search/" + language + "?q=" + word;
		LOG.info("Request url: " + url);
		Map<String, String> headers = new HashMap<>();
		headers.put("app_id", appId);
		headers.put("app_key", appKey);
		return restClient.requestGet(url, SearchResponse.class, headers);
	}

}
