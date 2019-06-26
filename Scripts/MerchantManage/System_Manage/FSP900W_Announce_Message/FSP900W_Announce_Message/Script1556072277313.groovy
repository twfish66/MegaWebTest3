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

'點公告訊息'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/annuncemessagemenu'))

'輸入標題'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/input__title'), '電車')

WebUI.delay(2)

'點查詢'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/query_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.takeScreenshot()

not_run: WebUI.scrollToElement(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/record_data'), 0)

WebUI.delay(2)

'點訊息資料'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/record_data2'))

//WebUI.click(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/record_data'))
'驗證資料內容有出現'
WebUI.verifyElementPresent(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/message_content'), 0)

WebUI.takeScreenshot()

'點返回'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/back_button'))

'要做清除先輸入標題'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/input__title'), '日本')

WebUI.delay(2)

WebUI.takeScreenshot()

'點清除'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/clear_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/System_Manage/AnnounceMessage/input__title'), '')

WebUI.takeScreenshot()

