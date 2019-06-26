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

WebUI.comment('========登入店家後台系統========')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.30.94:8080/ewallet-mega-seller/login')

WebUI.maximizeWindow()

//WebUI.delay(2)
WebUI.setText(findTestObject('Merchant_Manage/Login/Page_QRCode/input__invoiceNo'), findTestData('Merchant_Manage/LoginID').getValue(
        1, GlobalVariable.CurrentID))

WebUI.setText(findTestObject('Merchant_Manage/Login/Page_QRCode/input__id'), findTestData('Merchant_Manage/LoginID').getValue(
        2, GlobalVariable.CurrentID))

WebUI.setEncryptedText(findTestObject('Merchant_Manage/Login/Page_QRCode/input__passphraseInput'), findTestData('Merchant_Manage/LoginID').getValue(
        3, GlobalVariable.CurrentID))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Merchant_Manage/Login/Page_QRCode/button_'))

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

