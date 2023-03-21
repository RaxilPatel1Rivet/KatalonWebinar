import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

'Navigating to our base url.\r\n'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

'Waiting for the "Make Appointment" button to visible.'
WebUI.waitForElementVisible(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/a_Make Appointment'), 
    0)

'Clicking on the "Make Appointment" button.'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/a_Make Appointment'))

'Adding "John Doe" as username.\r\n '
WebUI.setText(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

'Adding password for the user.\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

'Verifying that login button is clickable or not ?'
WebUI.verifyElementClickable(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/button_Login'))

'Clicking on login button.\r\n'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/button_Login'))

'Selecting value from the dropdown box.'
WebUI.selectOptionByValue(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

'Checking checkbox.\r\n\r\n'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

'Selecting radio button.\r\n'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/input_Medicaid_programs'))

'Clicking on calender icon.'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

'Clicking on "22" text.(Date)'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/td_22'))

'Adding text into description text area.'
WebUI.setText(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/textarea_Comment_comment'), 'This is test')

'Verifying that "Book Appointment"  button is clickable or not ?'
WebUI.verifyElementClickable(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/button_Book Appointment'))

'Clicking on "Book Appointment" button.\r\n'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/button_Book Appointment'))

'Verfying text after clicking on "Book Appointment" button.'
WebUI.verifyElementText(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    'Appointment Confirmation')

'Verifying "Go to Homepage" button is visible or not.'
WebUI.verifyElementVisible(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/a_Go to Homepage'))

'Verifying "Go to Homepage" button is clickable or not.'
WebUI.verifyElementClickable(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/a_Go to Homepage'))

'Clicking on "Go to Homepage" button.'
WebUI.click(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/a_Go to Homepage'))

'Waiting for the element of home page to be visible.'
WebUI.waitForElementVisible(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 
    0)

'Verifying text from the home page.'
WebUI.verifyElementText(findTestObject('Object Repository/RecordModeDemo/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 
    'CURA Healthcare Service')

'Closing browser. '
WebUI.closeBrowser()

