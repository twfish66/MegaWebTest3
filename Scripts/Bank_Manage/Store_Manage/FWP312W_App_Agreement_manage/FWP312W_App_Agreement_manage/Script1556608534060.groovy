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

WebUI.delay(2)

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)

'點店家收款APP同意條款管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/APP_agreement_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

'新增'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/add_button'))

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/select_JBRoot'), 'string:A', 
    true)

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__agreeVersion'), '1.5.1')

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/select_active'), 'N', true)

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/textarea__agreeContent'), '防毒軟安裝最新版本需要同意內容')

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/textarea__agreeRemark'), '確認有安裝最新的防毒軟體')

WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/OK_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/add_message'), GlobalVariable.AddResultMessage)

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeBegin'), 0)

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeBegin'), today_format_beging)

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeEnd'), 0)

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeEnd'), today_format_end)

WebUI.scrollToPosition(50, 50)

'查詢'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/query_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/div_'))

'修改'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/modify_button'))

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__agreeVersion'), '1.5.2')

WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/OK_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/modify_message'), GlobalVariable.UpdateResultMessage)

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeBegin'), 0)

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeBegin'), today_format_beging)

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeEnd'), 0)

WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeEnd'), today_format_end)

WebUI.scrollToPosition(50, 50)

WebUI.delay(1)

'查詢'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/query_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/div_'))

WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/div_'))

WebUI.delay(1)

'明細'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/detail_button'))

WebUI.delay(1)

WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/detail_ok_button'))

WebUI.delay(1)

'刪除'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/delete_button'))

WebUI.delay(1)

WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/ok_delete_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/delete_message'), GlobalVariable.DeleteResultMessage)

WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/clear_button'), 0)

'清除'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/clear_button1'))

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeBegin'), 
    '')

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeEnd'), '')

