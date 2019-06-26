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
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-系統設定'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_QRCode/span_SystemConfig'))

WebUI.delay(1)

'點選menu-FWP504W APP版本查詢/設定'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_QRCode/span_APPVersion'))

WebUI.delay(1)

'輸入查詢條件-版本'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/input__avVersion'), 
    '2.0.5')

WebUI.delay(1)

'按下查詢'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/button_Query'))

WebUI.delay(1)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/h4_QueryOK'), 
    '查詢成功。')

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/div_data'), 
    1)

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/div_data'))

WebUI.delay(1)

'IE會點不到，故須先移至menu，以便讓腳本可以在IE執行'
WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_QRCode/span_DashboardMenu'), 
    1)

'按下明細'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/button_Detail'))

WebUI.delay(1)

'系統顯示檢視設定視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/h3_DetailWindow'), 
    '檢視設定')

WebUI.delay(1)

'按下確定，檢視完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/button_DetailOK'))

WebUI.delay(1)

'按下清除'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/button_Clean'))

WebUI.delay(1)

'確認是否正確清除'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_Query/Page_FWP504W - APP/input__avVersion'), 
    '')

