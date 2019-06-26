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

'DB先進行資料update動作'
CustomKeywords.'com.database.sql.connectDB'('192.168.30.94', '1433', 'ewallet_mega_phase1', 'sa', '1qaz@WSX3edc')

CustomKeywords.'com.database.sql.execute'('update disbursement_detail set rtn_code=null, manual_flag=null, update_user=null,update_time=null where id=\'9\'')

CustomKeywords.'com.database.sql.closeDatabaseConnection'()

WebUI.delay(2)

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)

'點撥款記錄調整'
WebUI.click(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/app_record_adjust_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/select_status'), '撥款失敗', 
    false)

WebUI.setText(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/input__disbursementBeginDate'), '2019-01-01')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/input__disbursementEndDate'), '2019-02-01')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/input__reconcileBeginDate'), '2019-01-01')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/input__reconcileEndDate'), '2019-02-01')

WebUI.delay(2)

'點查詢'
WebUI.click(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/query_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.takeScreenshot()

WebUI.delay(2)

'點匯出Excel'
WebUI.click(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/button_Excel'))

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/div_96979933_2'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/adjust_button'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/adjst_message'), '確定調整撥款狀態為成功?')

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/ok_adjust_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/adjust_result_message'), '已調整筆數 :1筆')

WebUI.delay(2)

'點清除'
WebUI.click(findTestObject('Bank_manage/Store_manage/Appropriation_Record_Adjust/clear_button'))

WebUI.takeScreenshot()

