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

WebUI.delay(2)

'首頁總覽'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/homepage'))

WebUI.delay(2)

'點交易管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/tran_manage_menu1'))

WebUI.delay(2)

'點交易管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/tran_manage_menu2'))

WebUI.delay(2)
'輸入交易區間'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/input__beginDate'), '2019-01-28')

'輸入交易區間'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/input__endDate'), '2019-01-28')

WebUI.delay(2)

'點查詢'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/query_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.takeScreenshot()

not_run: WebUI.scrollToElement(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/record_data'), 0)

WebUI.delay(2)

'點一筆資料'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/div_20190128121513101083'))

WebUI.scrollToPosition(50, 50)

WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/detail_button'))

WebUI.delay(2)

//WebUI.click(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/record_data'))
'驗證資料內容有出現'
not_run: WebUI.verifyElementPresent(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/message_content'), 0)

WebUI.takeScreenshot()

'點取消'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/cancel_button'))

WebUI.delay(2)

WebUI.takeScreenshot()

'點'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/button_Excel'))

WebUI.delay(2)

WebUI.takeScreenshot()

'點清除'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Transaction_Manage/clear_button'))

not_run: WebUI.verifyElementText(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/input__title'), '')

WebUI.takeScreenshot()

