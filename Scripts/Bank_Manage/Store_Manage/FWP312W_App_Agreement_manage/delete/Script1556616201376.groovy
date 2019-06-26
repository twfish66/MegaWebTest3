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

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)

'點店家收款APP同意條款管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/APP_agreement_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

for (def index : (1..20)) {
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
    WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/delete_button'))

    WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/ok_delete_button'))
}

not_run: WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/modify_message'), GlobalVariable.UpdateResultMessage)

not_run: WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeBegin'), 0)

not_run: WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeBegin'), today_format_beging)

not_run: WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeEnd'), 0)

not_run: WebUI.setText(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/input__createTimeEnd'), today_format_end)

not_run: WebUI.scrollToPosition(50, 50)

not_run: WebUI.delay(1)

'查詢'
not_run: WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/query_button'))

not_run: WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/div_'))

'刪除'
not_run: WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/delete_button'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/ok_delete_button'))

not_run: WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/div_'))

not_run: WebUI.delay(1)

'明細'
not_run: WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/detail_button'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Bank_manage/Store_manage/App_Agreemant_manage/detail_ok_button'))

