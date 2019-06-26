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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import groovy.time.TimeCategory as TimeCategory

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

'日誌紀錄'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/daily_recorder_menu'))

WebUI.delay(1)

'後台操作日誌查詢'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/operate_daily_query_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

not_run: start_date = CustomKeywords.'com.example.WebUICustomKeywords.getDate'()

not_run: WebUI.scrollToElement(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/input__aealAccessTimeBegin'), 
    0)

not_run: WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/input__aealAccessTimeBegin'))

not_run: WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/input__aealAccessTimeBegin'), '2019-05-01')

not_run: WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/input__aealAccessTimeEnd'), start_date)

WebUI.selectOptionByLabel(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/select_DMAPPQR CodeLogLogQR CodeLogLogQR CodeAPP'), 
    '廣告版面管理', false)

WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/input__aeUserId'), '018377')

WebUI.delay(1)

'查詢'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/query_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.delay(1)

'匯出excel'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/export_excel_button'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.delay(5)

'清除'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/clear_button'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/input__aeUserId'), '')

