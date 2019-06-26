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
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-系統設定'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_QRCode/span_SystemConfig'))

WebUI.delay(1)

'點選menu-FWP506W 信用卡卡面圖片上傳'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_QRCode/span_CreditCardPicture'))

WebUI.delay(1)

'按下新增'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/button_New'))

WebUI.delay(1)

'系統顯示新增卡面圖片視窗'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/h4_NewWindow'), 
    '新增卡面圖片')

WebUI.delay(1)

'選擇卡面模板'
WebUI.selectOptionByValue(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/select_cardClass'), 
    'string:G', true)

'輸入卡面代號'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/input__cardFaceId'), 
    '9999')

WebUI.delay(1)

'輸入卡面名稱'
WebUI.setText(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/input__cardFaceName'), 
    '回歸測試')

'選擇卡別'
WebUI.selectOptionByValue(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/select_VISAMasterCardJCB'), 
    'string:V', true)

'選擇卡面大小'
WebUI.selectOptionByValue(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/select_cardSize'), 
    'L', true)

'選擇檔案'
WebUI.uploadFile(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/input__cardImgFile'), 
    GlobalVariable.CreditcardPath)

WebUI.delay(1)

'按下確定，新增完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/button_NewOK'))

WebUI.delay(1)

'確認新增結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/h4_NewOK'), 
    '新增成功。')

WebUI.delay(1)

'按下查詢'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/button_Query'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/div_list'), 
    1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/div_9999'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_QRCode/span_SystemConfig'), 
    1)

'按下刪除'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/button_Delete'))

WebUI.delay(1)

'於刪除確認對話框，按下確定，刪除完成'
WebUI.click(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/button_DeleteOK'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'確認刪除結果狀態訊息'
WebUI.verifyElementText(findTestObject('Object Repository/FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_NewAndDelete/Page_FWP506W -/h4_DeleteOK'), 
    '刪除成功。')

