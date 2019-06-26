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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.30.94:8080/ewallet-manage/login?lightID=QRMP01')

WebUI.maximizeWindow()

'點選menu-首頁總覽'
WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-使用者管理'
WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_QRCode/span_UserManage'))

WebUI.delay(1)

'點選menu-FWP800W 角色群組管理'
WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_QRCode/span_RoleGroupManage'))

WebUI.delay(4)

'點選匯入'
WebUI.click(findTestObject('FWP_UserManage/FWP800W_ImportExport/Page_FWP800W -/button_Import'))

WebUI.delay(1)

'系統顯示輸入檔案視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_FWP800W -/h4_ImportWindow'), 
    '選擇要匯入的角色權限檔案')

WebUI.click(findTestObject(null))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_FWP800W -/input__uploadFileName'), 
    'C:\\Users\\CHT-User\\Downloads\\角色權限.xlsx')

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_FWP800W -/button_ImportOK'))

WebUI.click(findTestObject('FWP_UserManage/FWP800W_ImportExport/Page_FWP800W -/button_ImportCancel'))

