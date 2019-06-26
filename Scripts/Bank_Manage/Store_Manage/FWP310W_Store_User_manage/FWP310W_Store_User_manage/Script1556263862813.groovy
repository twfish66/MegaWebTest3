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

'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)

'點店家使用者管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/store_user_manage_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_User_manage/input__qidn'), '96979933', FailureHandling.STOP_ON_FAILURE)

'點查詢'
WebUI.click(findTestObject('Bank_manage/Common_Use/query_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_info_query/div_96979933'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/div_96979933'))

WebUI.scrollToPosition(50, 50)

'點修改'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/modify_button'))

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_User_manage/OK_button'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/OK_button'))

WebUI.takeScreenshot()

'明細'
WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_User_manage/input__qidn'), '96979933', FailureHandling.STOP_ON_FAILURE)

'點查詢'
WebUI.click(findTestObject('Bank_manage/Common_Use/query_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_info_query/div_96979933'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/div_96979933'))

WebUI.scrollToPosition(50, 50)

'點明細'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/detail_button'))

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_User_manage/OK_button'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/OK_button'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_User_manage/input__qidn'), '96979933', FailureHandling.STOP_ON_FAILURE)

'點清除'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_User_manage/clear_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Store_User_manage/input__qidn'), '')

