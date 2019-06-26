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

WebUI.comment('========帳號管理-修改========')


WebUI.scrollToElement(findTestObject('Merchant_Manage/System_Manage/Account_manage/Query/Page_FSP100W -/div_merchant1'), 0)

WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Query/Page_FSP100W -/div_merchant1'))

WebUI.scrollToPosition(50, 50)

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/modify_button'))

'姓名'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/input__seName'), '特店店長人員08')

WebUI.takeScreenshot()

'確認按鈕'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/confirm_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/modify_message'), GlobalVariable.UpdateResultMessage)

WebUI.takeScreenshot()
