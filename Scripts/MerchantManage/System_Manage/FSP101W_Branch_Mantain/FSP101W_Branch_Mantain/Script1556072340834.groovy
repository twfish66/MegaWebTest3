import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('========分店維護========')

WebUI.delay(2)

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

WebUI.delay(2)

'點系統管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/system_manage'))

WebUI.delay(2)

'點分店維護'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Branch_Mantain/branch_maintain'))

WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Branch_Mantain/merchant_name'), 'object:47', true)

not_run: WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Branch_Mantain/select_0001-0002-'), 'object:54', 
    true)

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/query_button'))

expectvalue = WebUI.getText(findTestObject('Merchant_Manage/System_Manage/Branch_Mantain/select_017969799330001-()017969799330002-017000000000010-017000000000010-017000000000011-017000000000012-017000000000013-'))

not_run: WebUI.verifyElementText(findTestObject('Merchant_Manage/System_Manage/Branch_Mantain/div_017969799330001-()'), 
    expectvalue)

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/clear_button'))

not_run: WebUI.verifyElementText(findTestObject('Merchant_Manage/System_Manage/Branch_Mantain/select_017969799330001-()017969799330002-017000000000010-017000000000010-017000000000011-017000000000012-017000000000013-'), 
    '全部')

