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
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-系統設定'
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_QRCode/span_SystemConfig'))

WebUI.delay(1)

'點選menu-FWP506W 信用卡卡面圖片上傳'
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_QRCode/span_CreditCardPicture'))

WebUI.delay(1)

'輸入查詢條件-卡片名稱'
WebUI.setText(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Query/input__cardFaceName'), 
    '信用卡')

'按下查詢'
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Query/button_Query'))

WebUI.delay(1)

'確認查詢結果狀態訊息'
WebUI.verifyElementText(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Query/h4_QueryOK'), 
    '查詢成功。')

'於IE執行，位置會移到頁尾，為讓腳本可以在IE執行，要自行移置頁首'
WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_QRCode/span_SystemConfig'), 
    1)

WebUI.delay(1)

'於查詢結果清單中，選擇第一筆資料'
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Modify/div_0001VM'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_QRCode/span_DashboardMenu'), 
    1)

'按下修改'
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Modify/button_Modify'))

WebUI.delay(1)

'系統顯示修改卡面圖片視窗'
WebUI.verifyElementText(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Modify/h4_ModifyWindow'), 
    '修改卡面圖片')

WebUI.delay(1)

'按下確定，完成修改作業'
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Modify/button_ModifyOK'))

WebUI.delay(1)

'確認修改結果狀態訊息'
WebUI.verifyElementText(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Modify/h4_ModifyOK'), 
    '更新成功。')

WebUI.delay(1)

'按下清除'
WebUI.click(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Query/button_Clean'))

WebUI.delay(1)

'確認是否正確清除'
WebUI.verifyElementText(findTestObject('FWP_SystemConfig/FWP506W_CreditCardPicture/FWP506W_QueryModifyClean/Page_FWP506W - Query/input__cardFaceName'), 
    '')

