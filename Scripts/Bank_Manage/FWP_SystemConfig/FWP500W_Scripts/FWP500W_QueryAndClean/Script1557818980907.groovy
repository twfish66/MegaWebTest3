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
WebUI.click(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-系統設定'
WebUI.click(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_QRCode/span_SystemConfig'))

WebUI.delay(1)

'點選menu-FWP500W 系統參數設定'
WebUI.click(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_QRCode/span_SysParameterConfig'))

WebUI.delay(1)

'輸入查詢條件-名稱'
WebUI.setText(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_FWP500W -/input__ssName'), 
    '卡號')

'按下查詢'
WebUI.click(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_FWP500W -/button_Query'))

WebUI.delay(2)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_FWP500W -/h4_QueryOK'), 
    '查詢成功。')

WebUI.delay(1)

'按下清除'
WebUI.click(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_FWP500W -/button_Clean'))

WebUI.delay(1)

'確認是否正確清除'
WebUI.verifyElementText(findTestObject('FWP_SystemConfig/FWP500W_SysParameterConfig/FWP500W_Query/Page_FWP500W -/input__ssName'), 
    '')

