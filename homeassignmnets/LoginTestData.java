package week3.homeassignmnets;

public class LoginTestData extends TestData {

	public void  enterUsername() {
		System.out.println("Please enter the user name");
	}

	public void  enterPassword() {
		System.out.println("Please enter the passowrd");
	}
	
	public static void main(String[] args) {
		
		TestData obj0 = new TestData();
		LoginTestData obj = new LoginTestData();
		
		obj0.enterCredentials();
		obj.enterUsername();
		obj.enterPassword();
		obj0.navigateToHomePage();
		

	}

}
