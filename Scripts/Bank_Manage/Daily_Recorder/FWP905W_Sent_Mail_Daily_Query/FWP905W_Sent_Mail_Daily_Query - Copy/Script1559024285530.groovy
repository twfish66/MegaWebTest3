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

'郵件發送紀錄查詢'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/mail_sent_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/sent_result'), '成功', false)

WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/test/input__toEmail'), 'test@gmail.com,name')

WebUI.delay(1)

'查詢'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/query_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.delay(1)

WebUI.delay(1)

WebUI.scrollToPosition(50, 50)

'明細'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/detail_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Bank_manage/Daily_Recoder/test/textarea__toEmail'), 'test@gmail.com,name')

WebUI.verifyElementText(findTestObject('Bank_manage/Daily_Recoder/test/input__etSubject'), '信用卡綁定成功')

WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/detail_ok_button'))

WebUI.delay(2)

'清除'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/clear_button'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Bank_manage/Daily_Recoder/test/input__toEmail'), '')

WebUI.verifyElementText(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/sent_result'), '全部', FailureHandling.STOP_ON_FAILURE)

