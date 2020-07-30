package cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;


public class GoogleCacheEviction {

	static CacheLoader<String, String> cacheLoader=new CacheLoader<String, String>() {
		
		@Override
		public String load(String key) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("in load");
			return key;
		}
	};
	

	
	public static void main(String[] args) {
		
		
		try {
			for(int i=0;i<100;i++) {
				cacheLoader.load("abc"+i);	
			}
			
			System.out.println("========================");
			
			
			
			LoadingCache<String, String> cache=CacheBuilder.newBuilder().maximumSize(200).build(cacheLoader);
			
			for(int i=0;i<100;i++) {
				String value=cache.getUnchecked("abc"+i);
				System.out.println(value);
			}
			
			System.out.println("+++++++++++++++++++++++");
			
			for(int i=0;i<100;i++) {
				String value=cache.getUnchecked("abc"+i);
				System.out.println(value);
			}
		
			System.out.println("88888888888888888888888888");
			
			cache.invalidateAll();
			
			for(int i=0;i<100;i++) {
				String value=cache.getUnchecked("abc"+i);
				System.out.println(value);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
