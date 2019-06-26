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

'首頁總覽'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/homepage'))

WebUI.delay(2)

WebUI.comment('========帳號管理-新增========')

'點系統管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/system_manage'))

WebUI.delay(2)

'點帳號管理'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_QRCode/account_manage'))

WebUI.delay(2)

'點新增按鈕'
WebUI.click(findTestObject('Merchant_Manage/Common_Use/Button/Add_button'))

WebUI.delay(2)

'職稱'
WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/seRole'), 'M', 
    true)

rannum = CustomKeywords.'com.example.WebUICustomKeywords.randomNumber'(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/input__seAccount'), 
    0, 1000)

'帳號'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/input__seAccount'), 'Merchant' + 
    rannum)

'密碼'
WebUI.setEncryptedText(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/input__sePwd'), 'eBtXs45gDutpe56RwWc2AA==')

'姓名'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/input__seName'), '特店店長人員01')

'手機號碼'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/input__seMobile'), '0977876555')

'電子信箱'
WebUI.setText(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/input__seEmail'), 'twfish66@gmail.com')

'狀態'
WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/sesActive'), 'Y', 
    true)

'是否收入收款App'
WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/seAppLogin'), 
    'Y', true)

'是否可退貨'
WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/selsRefund'), 
    'Y', true)

'所屬特店'
WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/seMerchantId'), 
    '107', true)

'是否可綁定裝置'
WebUI.selectOptionByValue(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/seIsBindDevice'), 
    'Y', true)

WebUI.takeScreenshot()

'確認按鈕'
WebUI.click(findTestObject('Merchant_Manage/System_Manage/Account_manage/Add/Page_FSP100W -/confirm_button'))

messagevalue = WebUI.getText(findTestObject('Merchant_Manage/Common_Use/Messagebox/add_message'))

'檢查新增成功訊息'
WebUI.verifyMatch(messagevalue, GlobalVariable.AddResultMessage, false)

WebUI.takeScreenshot()

