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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

for (int i = 1; i <= findTestData('New Test Data').getRowNumbers(); i++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://www.sieuthiversion3.somee.com/?AspxAutoDetectCookieSupport=1')

    WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/a_Login'))

    WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentLoginVie'), 'Hung')

    WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentLoginVie_1'), '123')

    WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/a_Forgot Password'))

    if (i == 1) {
        WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword'), findTestData(
                'New Test Data').getValue('UserName', i))

        WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_1'))

        WebUI.verifyElementText(findTestObject('Page_Super Market an Ecommerce Onli (1)/span_'), '*')
    }
    
    if (i == 2) {
        WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword'), findTestData(
                'New Test Data').getValue('UserName', i))

        WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_1'))

        WebUI.verifyElementText(findTestObject('Page_Super Market an Ecommerce Onli (2)/td_We were unable to access yo'), 
            'We were unable to access your information. Please try again.')
    }
    
    if (i == 3) {
        WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword'), findTestData(
                'New Test Data').getValue('UserName', i))

        WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_1'))

        WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_2'), findTestData(
                'New Test Data').getValue('Color', i))

        WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_3'))

        WebUI.verifyElementText(findTestObject('Page_Super Market an Ecommerce Onli (3)/span_'), '*')
    }
    
    if (i == 4) {
        WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword'), findTestData(
                'New Test Data').getValue('UserName', i))

        WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_1'))

        WebUI.setText(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_2'), findTestData(
                'New Test Data').getValue('Color', i))

        WebUI.click(findTestObject('Page_Super Market an Ecommerce Onli/input_ctl00MainContentPassword_3'))

        WebUI.verifyElementText(findTestObject('Page_Super Market an Ecommerce Onli (4)/td_Your answer could not be ve'), 
            'Your answer could not be verified. Please try again.')
    }
    
    WebUI.closeBrowser()
}

