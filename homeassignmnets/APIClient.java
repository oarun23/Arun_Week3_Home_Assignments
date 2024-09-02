package week3.homeassignmnets;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println("The value is " +endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println("The new endpoint is " +endpoint );
		
		System.out.println("The request body is " +requestBody );
		
		System.out.println("The request status" +requestStatus );
		
			}
	
	public static void main(String[] args) {
		
		APIClient obj1 = new APIClient();
		
		obj1.sendRequest("www.facebook.com");
		obj1.sendRequest("www.amazon.com", "Request Body", true);
	}
	
}
