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

WebUI.comment('========帳號管理-查詢========')
WebUI.delay(2)

'首頁總覽'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/homepage'))

WebUI.delay(2)

WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/homepage'))

'點系統管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/system_manage'))

WebUI.delay(2)

'點帳號管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/account_manage'))

'選擇查詢特店'
WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Account_manage/Query/Page_FSP100W -/qSeMerchantName'), '107', 
    true)

'輸入帳號'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Account_manage/Query/Page_FSP100W -/input__qSeAccount'), 'Mer')

'點查詢按鈕'
WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/query_button'))

WebUI.delay(2)

WebUI.takeScreenshot()

messagevalue = WebUI.getText(findTestObject('Merchant_Manage/Common_Use/Messagebox/query_message'))

'查詢結果-查詢成功'
WebUI.verifyMatch(messagevalue, GlobalVariable.QueryResultMessage, false)

'檢查查詢資料存在'
WebUI.verifyElementPresent(findTestObject('Merchant_Manage/System_Manage/Account_manage/Query/Page_FSP100W -/check_record'), 0)

'檢查查詢資料存在'
WebUI.verifyElementPresent(findTestObject('Merchant_Manage/System_Manage/Account_manage/Query/Page_FSP100W -/div_merchant1'), 0)

