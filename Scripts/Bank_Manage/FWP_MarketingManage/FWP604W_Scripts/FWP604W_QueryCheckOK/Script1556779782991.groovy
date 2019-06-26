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
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-行銷管理'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_/span_MarketingManage'))

WebUI.delay(1)

'點選menu-FWP604W 公告訊息審核'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_/span_MessageCheck'))

WebUI.delay(1)

'輸入查詢條件-審核狀態為待審核'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_FWP604W -/input__checkedState'))

WebUI.delay(1)

'按下查詢'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_FWP604W -/button_Query'))

WebUI.delay(1)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_FWP604W -/h4_QueryOK'), 
    '查詢成功。')

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_FWP604W -/input__ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.delay(1)

'按下審核'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_FWP604W -/button_Check'))

WebUI.delay(1)

'於審核確認對話框，按下確定，審核完成'
WebUI.click(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_FWP604W -/button_CheckOK'))

WebUI.delay(1)

'確認審核結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_MarketingManage/FWP604W_MessageCheck/FWP604W_Check/Page_FWP604W -/h4_CheckOK'), 
    '核可成功。')

