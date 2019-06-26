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
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_/span_'))

WebUI.delay(1)

'點選menu-行銷管理'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_/span__1'))

WebUI.delay(1)

'點選menu-FWP601W 郵件/簡訊/推播模板管理'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_/span__2'))

WebUI.delay(1)

'按下新增'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/button_New'))

WebUI.delay(1)

'系統顯示新增參數設定視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/h4_ParameterSetting'), 
    '新增參數設定')

'選擇發送類型'
WebUI.selectOptionByValue(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/select_SendType'), 
    '0', true)

'輸入模板代碼'
WebUI.setText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/input__etDocno'), 
    '7701')

'輸入模板名稱'
WebUI.setText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/input__etName'), 
    '簡訊測試')

'輸入主旨'
WebUI.setText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/input__etSubject'), 
    '簡訊測試')

'選擇顯示原始碼'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/a_codeview'))

WebUI.delay(2)

'輸入內文'
WebUI.setText(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/textarea__etContent'), 
    'TEST')

'關閉原始碼顯示'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/a_codeview'))

WebUI.delay(1)

'按下確定，新增完成'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/button_NewOK'))

WebUI.delay(1)

'確認新增結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/h4_newMessage'), 
    '新增成功。')

'按下查詢，查詢結果顯示於清單中'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/button_Query'))

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/div_1'))

WebUI.delay(1)

'按下修改'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/button_Modify'))

WebUI.delay(1)

'系統顯示修改參數設定視窗'
WebUI.verifyElementText(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/h4_ModifyPage'), 
    '修改參數設定')

'更新備註'
WebUI.setText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/textarea__etDescription'), 
    '簡訊測試')

'按下確定，修改完成'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/button_ModifyOK'))

WebUI.delay(1)

'確認修改結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/h4_ModifyMessage'), 
    '更新成功。')

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/div_1'))

WebUI.delay(1)

'按下刪除'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/button_Remove'))

WebUI.delay(1)

'於刪除確認對話框，按下確定，刪除完成'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/button__DeleteOK'))

WebUI.delay(1)

'確認刪除結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_New/Page_FWP601W -/h4_DeleteMessage'), 
    '刪除成功。')

