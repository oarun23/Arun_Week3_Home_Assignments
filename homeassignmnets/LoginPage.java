package week3.homeassignmnets;

public class LoginPage extends BasePage {

	public void performCommonTasks() {
		
		System.out.println("Please dont perform the task");
		
	}
	
	public static void main(String[] args) {
		
		
		BasePage obj1 = new BasePage();
		
	
		obj1.findElement();
		obj1.clickElement();
		obj1.enterText();
		obj1.performCommonTasks();
		
		LoginPage obj = new LoginPage();
		obj.findElement();
		obj.clickElement();
		obj.enterText();
		obj.performCommonTasks();
		
		
	}
	
}
