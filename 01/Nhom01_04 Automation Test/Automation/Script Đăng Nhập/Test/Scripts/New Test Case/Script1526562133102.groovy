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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (int i = 1; i <= findTestData('New Test Data').getRowNumbers(); i++) {
	System.out.print(findTestData('New Test Data').getValue('UserName', i))
	System.out.print(findTestData('New Test Data').getValue('Password', i))
	
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://www.sieuthiversion3.somee.com')

    WebUI.click(findTestObject('a_Login'))

    WebUI.setText(findTestObject('input_ctl00MainContentLoginVie'), findTestData('New Test Data').getValue('UserName', i))

    WebUI.setText(findTestObject('input_ctl00MainContentLoginVie (1)'), findTestData('New Test Data').getValue('Password', 
            i))

    WebUI.click(findTestObject('input_ctl00MainContentLoginVie (2)'))

    if (i == 1) {
        WebUI.verifyElementText(findTestObject('div_Your login attempt was not'), 'Your login attempt was not successful. Please try again.')
    }
    
    if (i == 2) {
        WebUI.verifyElementText(findTestObject('UserRe'), '*')

        WebUI.verifyElementText(findTestObject('PassRe'), '*')
    }
    
    if (i == 3) {
        WebUI.verifyElementText(findTestObject('UserRe'), '*')
    }
    
    if (i == 4) {
        WebUI.verifyElementText(findTestObject('PassRe'), '*')
    }
    
    WebUI.closeBrowser()
}

