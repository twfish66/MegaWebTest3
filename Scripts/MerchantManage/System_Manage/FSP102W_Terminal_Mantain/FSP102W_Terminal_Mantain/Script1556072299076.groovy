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

WebUI.comment('========端末機綁定維護========')

WebUI.delay(2)

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

WebUI.delay(2)

'點系統管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/system_manage'))

WebUI.delay(2)

'點端末機綁定維護'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Terminal_Mantain/Terminal_Mantain_menu'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Terminal_Mantain/select_017969799330001-()017969799330002-017000000000010-017000000000010-017000000000011-017000000000012-017000000000013-'), 
    'object:82', true)

not_run: WebUI.selectOptionByLabel(findTestObject('Merchant_Manage/System_Manage/Terminal_Mantain/select_status'), '已解除綁定', 
    false)

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/query_button'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Merchant_Manage/Common_Use/Other/per_page'), 0)

'點選要刪除的資料'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Terminal_Mantain/div_4f2cc38f-cddf-4888-8532-111c4d1855be'))

WebUI.takeScreenshot()

count = WebUI.getText(findTestObject('Merchant_Manage/Common_Use/Other/recore_count'))

WebUI.scrollToPosition(50, 50)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/delete_button'))

WebUI.scrollToElement(findTestObject('Merchant_Manage/Common_Use/Other/recore_count'), 0)

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Other/recore_count'), count - 1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Terminal_Mantain/select_017969799330001-()017969799330002-017000000000010-017000000000010-017000000000011-017000000000012-017000000000013-'), 
    'object:82', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/clear_button'))

WebUI.takeScreenshot()

not_run: WebUI.verifyElementText(findTestObject('Merchant_Manage/System_Manage/Terminal_Mantain/select_017969799330001-()017969799330002-017000000000010-017000000000010-017000000000011-017000000000012-017000000000013-'), 
    '全部')

