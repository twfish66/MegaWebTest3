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

WebUI.delay(1)

'點選menu-首頁總覽'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-行銷管理'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_/span_MarketingManage'))

WebUI.delay(1)

'點選menu-FWP602W 公告訊息管理'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_/span_MessageManage'))

WebUI.delay(1)

'按下新增'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/button_New'))

WebUI.delay(1)

'系統顯示新增公告訊息視窗'
WebUI.verifyElementText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewAndSend/Page_FWP602W -/h4_MessageNewWindow'), 
    '新增公告訊息')

'輸入訊息標題'
WebUI.setText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/input__naName'), 
    '回歸測試')

'輸入顯示優先順序'
WebUI.setText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/input__naWeight'), 
    '201')

'選擇顯示原始碼'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/a_codeview'))

WebUI.delay(1)

'輸入內文'
WebUI.setText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/textarea__cke_source cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr'), 
    '回歸測試')

'關閉原始碼顯示'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/a_codeview'))

WebUI.delay(1)

'選擇上架狀態'
WebUI.selectOptionByValue(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/select_State'), 
    'Y', true)

'輸入有效日期-起'
WebUI.setText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/input__naStarttime'), 
    '2019-05-15 16:25')

'輸入有效日期-迄'
WebUI.setText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/input__naEndtime'), 
    '2019-05-20 16:25')

WebUI.scrollToElement(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/button_NewOK'), 
    1)

'按下確定，新增完成'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/button_NewOK'))

WebUI.delay(1)

'確認新增結果狀態訊息'
WebUI.verifyElementText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/h4_OK'), 
    '查詢成功。')

WebUI.delay(1)

'因為IE跑腳本會hang住，所以多加一個動作，取得focus'
WebUI.scrollToElement(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W - Check/input_unCheck'), 
    1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W - Check/input_unCheck'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/button_Delete'), 
    0)

'按下刪除'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/button_Delete'))

WebUI.delay(1)

'於刪除確認對話框，按下確定，刪除完成'
WebUI.click(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/button_DeleteOK'))

WebUI.delay(1)

'確認刪除結果狀態訊息'
WebUI.verifyElementText(findTestObject('FWP_MarketingManage/FWP602W_MessageManage/FWP602W_NewModifyDelete/Page_FWP602W -/h4_DeleteOK'), 
    '刪除成功。')

