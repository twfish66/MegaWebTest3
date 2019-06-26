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
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-系統設定'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_QRCode/span_SystemConfig'))

WebUI.delay(1)

'點選menu-FWP504W APP版本查詢/設定'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_QRCode/span_APPVersionConfig'))

WebUI.delay(1)

'按下新增'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/button_New'))

WebUI.delay(1)

'系統顯示新增設定視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/h3_NewWindow'), 
    '新增設定')

WebUI.delay(1)

'輸入版本'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/input__avVersion'), 
    '9.9.9')

'輸入版本名稱'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/input__avName'), 
    '回歸測試')

'選擇上架狀態'
WebUI.selectOptionByValue(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/select_State'), 
    'string:Y', true)

'輸入更新URL'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/input_URL_avUpdatingUrl'), 
    'http://192.168.30.94:8080/ewallet-manage/login?lightID=QRMP01')

'輸入完整性檢查值'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/textarea__avIntegrityCheckValue'), 
    '回歸測試')

WebUI.delay(1)

'按下確定，新增完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/button_NewOK'))

WebUI.delay(1)

'確認新增結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/h4_NewOK'), 
    '查詢成功。')

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/div_999'), 
    1)

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/div_999'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_QRCode/span_DashboardMenu'), 
    1)

'按下修改'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/button_Modify'))

WebUI.delay(1)

'系統顯示修改設定視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/h3_ModifyWindow'), 
    '修改設定')

WebUI.delay(1)

'輸入備註'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/textarea__avRemark'), 
    '回歸測試')

WebUI.delay(1)

'按下確定，修改完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/button_ModifyOK'))

WebUI.delay(1)

'確認修改結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/h4_ModifyOK'), 
    '查詢成功。')

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/div_999'), 
    1)

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/div_999'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_QRCode/span_DashboardMenu'), 
    0)

'按下刪除'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/button_Delete'))

WebUI.delay(1)

'於刪除確認對話框，按下確定，刪除完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/button_DeleteOK'))

WebUI.delay(2)

'確認刪除結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP504W_AppVersionConfig/FWP504W_NewModifyDelete/Page_FWP504W - APP/h4_DeleteOK'), 
    '查詢成功。')

WebUI.delay(1)

