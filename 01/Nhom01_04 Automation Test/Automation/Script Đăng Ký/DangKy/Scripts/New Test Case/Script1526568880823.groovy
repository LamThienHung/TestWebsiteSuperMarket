import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
for(int i=1;i<=findTestData('New Test Data').getRowNumbers();i++)
{
WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.sieuthiversion3.somee.com')

WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli (3)/a_Create Account'))

WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentCreateUs'), findTestData('New Test Data').getValue(
        "Name", i))

WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentCreateUs_1'), findTestData('New Test Data').getValue(
        "Email", i))

WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentCreateUs_2'), findTestData('New Test Data').getValue(
        "UserName", i))

WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentCreateUs_3'), findTestData('New Test Data').getValue(
        "Password", i))

WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentCreateUs_4'), findTestData('New Test Data').getValue(
        "CoPassword", i))

WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentCreateUs_5'), findTestData('New Test Data').getValue(
        "Color", i))
System.out.print(findTestData('New Test Data').getValue("Name", i))
System.out.print(findTestData('New Test Data').getValue("Email", i))
System.out.print(findTestData('New Test Data').getValue("UserName", i))
System.out.print(findTestData('New Test Data').getValue("Password", i))
System.out.print(findTestData('New Test Data').getValue("CoPassword", i))
System.out.print(findTestData('New Test Data').getValue("Color", i))

WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/i'))

WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentCreateUs_6'))
if(i<3)
{
	WebUI.verifyElementText(findTestObject('Page_Super Market an Ecommerce Onli (1)/span_The password and confirma'), 'The password and confirmation password must match.')
}
else
{
	WebUI.verifyElementText(findTestObject('Page_Super Market an Ecommerce Onli (2)/div_The password and confirmat'), 'Password length minimum: 7. Non-alphanumeric characters required: 1.')
}
WebUI.closeBrowser()
}
