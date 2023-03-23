import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class LoginSteps {

	@Given("User is on the Login page.")
	public void user_is_on_the_Login_page() {
		
		println("I am inside given");
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		
		WebUI.maximizeWindow()
		
	}

	@When("User enters (.*) and (.*).")
	public void user_enters_username_and_password(String username, String password) {
		
		println("I am inside when");
		
		WebUI.setText(findTestObject('ManualModeDemo/Page_OrangeHRM/input_Username_username'), username)
		
		WebUI.setText(findTestObject('ManualModeDemo/Page_OrangeHRM/input_Password_password'), password)
	}

	@Then("User is navigate to Home page.")
	public void user_is_navigate_to_Home_page() {
		
		println("I am inside then");
		
		WebUI.click(findTestObject('ManualModeDemo/Page_OrangeHRM/button_Login'))
		
		WebUI.verifyTextPresent('Dashboard', false)
		
		WebUI.closeBrowser()
	}
}
