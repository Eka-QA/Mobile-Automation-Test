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

/*------------------------------------------------------------------------------------------------
 * SUMMARY: Existing user success login and logout within the platform
 *
 * STEPS:
 * - Open melalie app on android mobile
 * - Tap profile menu
 * - Input valid credentials
 * - Tap login button
 * - Verify success to login 
 * - Logout user
 * - Verify success to logout
 *
 * TEARDOWN:
 * - Close Application
 *------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------
 * TEST DATA
 *-----------------------------------------------------------------------------------------------*/

def emailAddress = 'hyperspace.cyber@gmail.com'
def password = 'temp1234'

//Open melalie app on android mobile
Mobile.startApplication('C:\\Users\\cocon\\Katalon Studio\\Melalie Android Mobile Application\\androidapp\\Melalie_2.1.5_apkcombo.com.apk', true)

//Tap profile menu
Mobile.tap(findTestObject('Object Repository/Melalie-App/android.view.View'), 0)
Mobile.delay(GlobalVariable.DelayShort)

//Input valid credentials
Mobile.setText(findTestObject('Object Repository/Melalie-App/android.widget.EditText - youexample.com'), emailAddress, 0)
Mobile.delay(GlobalVariable.DelayShort)
Mobile.setText(findTestObject('Object Repository/Melalie-App/android.widget.EditText'), password, 0)
Mobile.tap(findTestObject('Object Repository/Melalie-App/android.view.ViewGroup (1)'), 0)

//Verify success to login 
Mobile.verifyElementExist(findTestObject('Object Repository/Melalie-App/android.widget.ImageView'), 0)

//Logout user
Mobile.tap(findTestObject('Object Repository/Melalie-App/android.view.ViewGroup (3)'), 0)
Mobile.tap(findTestObject('Object Repository/Melalie-App/android.view.ViewGroup (4)'), 0)

//Verify success to logout
Mobile.verifyElementExist(findTestObject('Object Repository/Melalie-App/android.widget.EditText - youexample.com'), 0)

/*------------------------------------------------------------------------------------------------
 * TEAR DOWN
 *-----------------------------------------------------------------------------------------------*/
//Close application

Mobile.closeApplication()

