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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://192.168.30.94:8080/ewallet-manage/login?lightID=QRMP01')

not_run: WebUI.maximizeWindow()

'點選menu-首頁總覽'
WebUI.click(findTestObject('FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-交易紀錄'
WebUI.click(findTestObject('FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_QRCode/span_TransactionRecord'))

WebUI.delay(1)

'點選menu-FWP701W 信用卡交易記錄查詢'
WebUI.click(findTestObject('FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_QRCode/span_CreditCardTransaction'))

WebUI.delay(1)

'輸入付款人身分證皓'
WebUI.setText(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/input__cusId'), 
    'A123456789')

'選擇個資查詢理由'
WebUI.selectOptionByValue(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/select_QueryReason'), 
    '02', true)

WebUI.delay(1)

'按下查詢'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/button_Query'))

WebUI.delay(1)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/h4_QueryOK'), 
    '查詢成功。')

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/div_2019-05-02 173335873'))

WebUI.delay(1)

'按下明細'
WebUI.click(findTestObject('FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/button_Detail'))

WebUI.delay(1)

'系統顯示交易明細查詢視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/h4_DetailWindow'), 
    '交易明細查詢')

WebUI.delay(2)

'按下確定，完成檢視'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/button_DetailOK'))

WebUI.delay(1)

'按下清除'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/button_Clean'))

WebUI.delay(1)

'確認是否正確清除'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_TransactionRecord/FWP701W_CreditCardTransaction/FWP701W_Query/Page_FWP701W -/input__cusId'), 
    '')

