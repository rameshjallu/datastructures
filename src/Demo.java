
public class Demo {

	
	public static void main(String[] args) {
		
		System.out.println(getJsonString("TotalUtilPercent"));
		
	}
	
	
	 public static String getJsonString(String metricName) {
	        String metricJSONName = (metricName.replaceAll("[^a-zA-Z0-9_]", "_")).replaceAll("_+", "_");
	        if (metricJSONName.endsWith("_")) {
	            metricJSONName = metricJSONName.substring(0, metricJSONName.length() - 1);
	        }
	        if (metricJSONName.startsWith("_")) {
	            metricJSONName = metricJSONName.substring(1, metricJSONName.length());
	        }
	        return metricJSONName.toLowerCase();
	    }
	 
}
