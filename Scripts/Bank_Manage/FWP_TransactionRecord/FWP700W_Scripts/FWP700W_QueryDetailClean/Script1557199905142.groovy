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
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-交易紀錄'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_QRCode/span_TransactionRecord'))

WebUI.delay(1)

'點選menu-FWP700W 金融卡/帳戶交易記錄查詢'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_QRCode/span_AccountTransaction'))

WebUI.delay(1)

'輸入特店代號'
WebUI.setText(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/input__cmMerchantNo'), 
    '017969799330001')

'輸入交易區間-起'
WebUI.setText(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/input__tmTxnTimeStart'), 
    '2019-04-07 ')

'輸入交易區間-迄'
WebUI.setText(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/input__tmTxnTimeEnd'), 
    '2019-04-13 ')

'選擇個資查詢理由'
WebUI.selectOptionByValue(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/select_QueryReason'), 
    '02', true)

'按下查詢'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/button_Query'))

WebUI.delay(1)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/h4_QueryOK'), 
    '查詢成功。')

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/div_96979933'))

WebUI.delay(1)

'按下明細'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/button_Detail'))

'系統顯示交易明細查詢視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/h4_DetailWindow'), 
    '交易明細查詢')

WebUI.delay(1)

'按下確定，完成檢視'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/button_DetailOK'))

WebUI.delay(1)

'按下清除'
WebUI.click(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/button_Clean'))

WebUI.delay(1)

'確認是否正確清除'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_TransactionRecord/FWP700W_AccountTransaction/FWP700W_Query/Page_FWP700W -/input__cmMerchantNo'), 
    '')

