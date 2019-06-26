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
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_/span_DashboardMenu'))

WebUI.delay(2)

'點選menu-行銷管理'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_/span_MarketingManage'))

WebUI.delay(2)

'點選menu-FWP601W 郵件/簡訊/推播模板管理'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_/span_MarketingTemplateManage'))

WebUI.delay(2)

'輸入查詢條件-模板名稱'
WebUI.setText(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_FWP601W -/input__etName'), 
    '通知')

'按下查詢'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_FWP601W -/button_query'))

WebUI.delay(2)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_FWP601W -/h4_QueryMessage'), 
    '查詢成功。')

WebUI.delay(2)

'按下清除'
WebUI.click(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_FWP601W -/button_clean'))

WebUI.delay(2)

'確認是否正確清除'
WebUI.verifyElementText(findTestObject('FWP_MarketingManage/FWP601W_MarketingTemplateManage/FWP601W_Query/Page_FWP601W -/input__etName'), 
    '')

