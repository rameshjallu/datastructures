/*
 * Copyright (c) 2019 CA. All rights reserved.
 * 
 * This software and all information contained therein is confidential and
 * proprietary and shall not be duplicated, used, disclosed or disseminated in
 * any way except as authorized by the applicable license agreement, without
 * the express written permission of CA. All authorized reproductions must be
 * marked with this language.
 * 
 * EXCEPT AS SET FORTH IN THE APPLICABLE LICENSE AGREEMENT, TO THE EXTENT
 * PERMITTED BY APPLICABLE LAW, CA PROVIDES THIS SOFTWARE WITHOUT WARRANTY OF
 * ANY KIND, INCLUDING WITHOUT LIMITATION, ANY IMPLIED WARRANTIES OF
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. IN NO EVENT WILL CA BE
 * LIABLE TO THE END USER OR ANY THIRD PARTY FOR ANY LOSS OR DAMAGE, DIRECT OR
 * INDIRECT, FROM THE USE OF THIS SOFTWARE, INCLUDING WITHOUT LIMITATION, LOST
 * PROFITS, BUSINESS INTERRUPTION, GOODWILL, OR LOST DATA, EVEN IF CA IS
 * EXPRESSLY ADVISED OF SUCH LOSS OR DAMAGE.
 */

package cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;


public class MetricPathMetaDataCache {
	

	private static LoadingCache<String, Map<String,String>> cache ;
	
	public void init(long expiry, long cacheSize){
		
	    cache = CacheBuilder
			.newBuilder()
			.expireAfterAccess(expiry,
					TimeUnit.MINUTES).maximumSize(cacheSize)
			.build(new CacheLoader<String, Map<String,String>>() {
				@Override
				public Map<String,String> load(String resource) throws Exception {
					Map<String,String> metaDataMap = findInResource(resource);
					return metaDataMap;
				}

			});
	}

	


	private Map<String, String> findInResource(String resource) {
		Map<String, String> metaDataMap = new HashMap<String, String>();
		
		
		
		return metaDataMap;
	}
	
	
	public static LoadingCache<String, Map<String,String>> getMetricCache() {
		return cache;
	}

	public void invalidateCache() {
		cache = null;
	}

}
