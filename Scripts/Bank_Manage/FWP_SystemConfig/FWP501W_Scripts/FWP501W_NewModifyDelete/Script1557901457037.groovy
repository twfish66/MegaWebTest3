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
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-系統設定'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_QRCode/span_SystemConfig'))

WebUI.delay(1)

'點選menu-FWP501W 系統訊息設定'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_QRCode/span_SysMessageConfig'))

WebUI.delay(1)

'按下新增'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/button_New'))

WebUI.delay(1)

'系統顯示新增新增系統訊息設定視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/h4_NewWindow'), 
    '新增系統訊息設定')

WebUI.delay(1)

'輸入系統代碼'
WebUI.setText(findTestObject('FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -New/input__smDocno'), 
    'Z000')

'輸入系統訊息'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/textarea__smMessage'), 
    '回歸測試')

'輸入回應馬'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/input__smRtnCode'), 
    '0000')

'輸入回應訊息'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/textarea__smRtnMessage'), 
    '回歸測試')

'按下確定，新增完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/button_NewOK'))

WebUI.delay(1)

'確認新增結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/h4_NewOK'), 
    '新增成功。')

WebUI.delay(1)

WebUI.switchToDefaultContent()

'於查詢條件輸入系統代碼'
WebUI.setText(findTestObject('FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W - Query/input__smDocno_Query'), 
    'Z000')

WebUI.delay(1)

'按下查詢，查詢結果顯示於清單中'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/button_Query'))

WebUI.delay(1)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/h4_QueryOK'), 
    '查詢成功。')

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/div_Z000'))

WebUI.delay(1)

'按下修改'
WebUI.click(findTestObject('FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/button_Modify'))

WebUI.delay(1)

'系統顯示修改修改系統訊息設定視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/h4_ModifyWindow'), 
    '修改系統訊息設定')

WebUI.delay(1)

'輸入描述'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/textarea__smDescription'), 
    '回歸測試')

'按下確定，修改完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/button_ModifyOK'))

WebUI.delay(1)

'確認修改結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/h4_ModifyOK'), 
    '更新成功。')

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/div_Z000'))

WebUI.delay(1)

'按下刪除'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/button_Delete'))

WebUI.delay(1)

'於刪除確認對話框，按下確定，刪除完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/button_DeleteOK'))

WebUI.delay(1)

'確認刪除結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP501W_SysMessageConfig/FWP501W_NewModifyDelete/Page_FWP501W -/h4_DeleteOK'), 
    '刪除成功。')

WebUI.delay(1)
