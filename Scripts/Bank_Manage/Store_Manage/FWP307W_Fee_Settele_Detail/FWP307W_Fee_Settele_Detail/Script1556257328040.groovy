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

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

WebUI.delay(1)

'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)

'手續費結算明細'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/fee_settle_menu'))

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/input__cmFein'), '96979933')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Fee_Settele_Detail/input__beginDate'), '2019-04-12')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Fee_Settele_Detail/input__endDate'), '2019-04-12')

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/query_button'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.takeScreenshot()

'輸出excel'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/excel_download_button'))

WebUI.delay(3)

'全部明細下載'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/all_detail_download_button'))

WebUI.delay(8)

'選擇要下載的資料'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/div_96979933'))

'下載明細'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/detail_download_button'))

WebUI.delay(4)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Fee_Settele_Detail/clear_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Fee_Settele_Detail/input__cmFein'), '')

WebUI.takeScreenshot()

