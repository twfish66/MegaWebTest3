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

use(TimeCategory, { 
        today = new Date()

        lastWeek = (today - 1.week)

        NextWeek = (today + 1.week)

        NextMonth = (today + 1.month)

        twodaysAgo = (today - 2.days)
    })

today_format_beging = (today.format('yyyy-MM-dd') + ' 00:00:00')

today_format_end = (today.format('yyyy-MM-dd') + ' 23:59:59')

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

'日誌紀錄'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/daily_recorder_menu'))

WebUI.delay(1)

'郵件發送紀錄查詢'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/mail_sent_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

not_run: start_date = CustomKeywords.'com.example.WebUICustomKeywords.getDate'()

not_run: WebUI.scrollToElement(findTestObject('Bank_manage/Daily_Recoder/Service_Daily_Query/input__createTimeBegin'), 0)

not_run: WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Service_Daily_Query/input__createTimeBegin'))

not_run: WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/Service_Daily_Query/input__createTimeBegin'), '2019-05-13 00:30:53')

not_run: WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/Service_Daily_Query/input__createTimeEnd'), '2019-05-14 23:30:53')

WebUI.selectOptionByLabel(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/sent_result'), '成功', false)

not_run: WebUI.selectOptionByLabel(findTestObject('Bank_manage/Daily_Recoder/Creditcard_Daily_Query/select_GETPOST'), 'POST', 
    false)

not_run: WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/input__createTimeBegin'), today_format_beging)

WebUI.delay(1)

'查詢'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/query_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/div_qryLoveCode'), 0)

WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/div_qryLoveCode'))

WebUI.delay(1)

WebUI.scrollToPosition(50, 50)

'明細'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/detail_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

get_result = WebUI.getText(findTestObject('Bank_manage/Daily_Recoder/test/result_data'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(get_result, '成功')

WebUI.scrollToElement(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/detail_ok_button'), 0)

WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/detail_ok_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/resent_button'))

WebUI.delay(2)

'清除'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/clear_button'))

WebUI.delay(1)

not_run: WebUI.verifyElementText(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/input__aeUserId'), '')

