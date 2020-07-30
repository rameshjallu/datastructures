package strings;

public class AtoI {

	public static void main(String[] args) {
		
		String apmServicesGatewayExternalUrl = "https://apmservices-gateway-ao-apm.app.gdue4.saasdev.broadcom.com";
		
		if(apmServicesGatewayExternalUrl != null) {
            if(apmServicesGatewayExternalUrl.endsWith("/")) {
                apmServicesGatewayExternalUrl = apmServicesGatewayExternalUrl.substring(
                    0, apmServicesGatewayExternalUrl.length() - 1);
            }
        }
		
		
		System.out.println(apmServicesGatewayExternalUrl);
	}
}
