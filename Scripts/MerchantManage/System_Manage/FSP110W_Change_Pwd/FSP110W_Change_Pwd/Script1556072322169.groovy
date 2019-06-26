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

WebUI.comment('========變更密碼========')

WebUI.delay(2)

'首頁總覽'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/homepage'))

WebUI.delay(2)

'點系統管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/system_manage'))

WebUI.delay(2)

'點變更密碼\r\n'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/change_pwd'))

WebUI.delay(2)

'舊密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__oldPwd'), findTestData('Merchant_Manage/LoginID').getValue(
        5, GlobalVariable.CurrentID))

'新密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__newPwd'), findTestData('Merchant_Manage/LoginID').getValue(
        6, GlobalVariable.CurrentID))

'確認密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__rePwd'), findTestData('Merchant_Manage/LoginID').getValue(
        6, GlobalVariable.CurrentID))

WebUI.click(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/modify_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/update_message'), GlobalVariable.UpdateResultMessage)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Other/Logindata'))

WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/Logout_Button'))

WebUI.delay(2)

'使用新密碼登入'
WebUI.setText(findTestObject('Merchant_Manage/Login/Page_QRCode/input__invoiceNo'), findTestData('Merchant_Manage/LoginID').getValue(1, 
        GlobalVariable.CurrentID))

WebUI.setText(findTestObject('Merchant_Manage/Login/Page_QRCode/input__id'), findTestData('Merchant_Manage/LoginID').getValue(2, GlobalVariable.CurrentID))

WebUI.setEncryptedText(findTestObject('Merchant_Manage/Login/Page_QRCode/input__passphraseInput'), findTestData('Merchant_Manage/LoginID').getValue(
        4, GlobalVariable.CurrentID))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Merchant_Manage/Login/Page_QRCode/button_'))

'修改為原本舊的密碼'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/homepage'))

'點系統管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/system_manage'))

WebUI.delay(2)

'點變更密碼\r\n'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/change_pwd'))

'舊密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__oldPwd'), findTestData('Merchant_Manage/LoginID').getValue(
        6, GlobalVariable.CurrentID))

'新密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__newPwd'), findTestData('Merchant_Manage/LoginID').getValue(
        5, GlobalVariable.CurrentID))

'確認密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__rePwd'), findTestData('Merchant_Manage/LoginID').getValue(
        5, GlobalVariable.CurrentID))

WebUI.click(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/modify_button'))

WebUI.delay(2)

WebUI.takeScreenshot()

'舊密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__oldPwd'), findTestData('Merchant_Manage/LoginID').getValue(
        6, GlobalVariable.CurrentID))

'新密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__newPwd'), findTestData('Merchant_Manage/LoginID').getValue(
        5, GlobalVariable.CurrentID))

'確認密碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Change_Pwd/input__rePwd'), findTestData('Merchant_Manage/LoginID').getValue(
        5, GlobalVariable.CurrentID))

'清除'
WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/clear_button'))

WebUI.takeScreenshot()

