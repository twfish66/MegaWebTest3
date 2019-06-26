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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://192.168.30.94:8080/ewallet-manage/login?lightID=QRMP01')
//
//WebUI.maximizeWindow()
//
'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

WebUI.delay(2)
'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)
'點店家資訊管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_info_manage'))

WebUI.delay(2)

WebUI.takeScreenshot()

'點新增按鈕'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/add_button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmHqbanidnNo'), '96979933')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmInvoiceNo'), '96979933')

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select_'), 'A', true)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/auto_gen_Mno_button'))

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmDuInvoiceNo'), '1')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmName4'), '回歸測試店')

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__1'), 'N', 
    true)

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmBusinessZipCode'), 
    '100')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmBusinessAddress'), 
    '台北市信義區信義路二段55後9樓')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmName1'), '回歸測試巡迴店')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmAddress'), '台北市信義區信義路二段55後9樓')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmEnAddress'), 'Taipei Xinyi road 2 section no.55')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmAreaCode'), '02')

WebUI.delay(2)

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmTelephone'), '23568956')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmEnName'), 'Regression Test Store')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmEmail1'), 'aa@gmail.com')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmContact1'), '回歸大老')

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__2'), 'Y', 
    true)

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmCellphone'), '0955878444')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_MCC Code()_cmMccCode'), 
    '5001')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmSelfPurRate'), '1')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmIntbkPurRate'), '1')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmSelfRefundRate'), 
    '1')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmIntbkRefundRate'), 
    '1')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmSelfReturnRfndRate'), 
    '1')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmIntbkReturnRfndRate'), 
    '1')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmMaxAmtPurchaseDay'), 
    '50000')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmMaxAmtRefundDay'), 
    '50000')

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__3'), 'Y', 
    true)

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__4'), 'Y', 
    true)

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__5'), 'Y', 
    true)

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__6'), 'Y', 
    true)

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmFirstYearCharge'), 
    '0')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmRenewalCharge'), '5000')

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/div_()()()()()()()()()()(N)()()()(1360)306090180360()()()(24)()()()()()()()()()()()()()()()()'))

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmMaxAmtRefundMon'), 
    '50000')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmMaxAmtPurchaseMon'), 
    '50000')

WebUI.delay(2)
'新增特店'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/add_store_button'))

WebUI.delay(2)

WebUI.takeScreenshot()

'確定新增特店'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/confirm_add_store_button'))

'輸入分店資訊'
WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_(QR Code)_cmbName'), '回歸測試信義店')

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__7'), 'A', 
    true)

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input_()_cmbSimpleName'), '回歸測試信義立牌')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmbCity'), '台北市')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmbNameEn'), 'Regression Test Xinyi')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmbAddress'), '台北市信義區信義路100號')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmbCusTelephone'), '02-25689548')

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmbAcctNo1'), '00267372100')

WebUI.delay(2)

WebUI.takeScreenshot()

'新增分店'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/add_branch_button'))

WebUI.setText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/input__cmbtTermName'), '回歸測試櫃台1')

WebUI.selectOptionByValue(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/select__8'), 'A', 
    true)

WebUI.delay(2)

WebUI.takeScreenshot()

'新增端末'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/add_term_button'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/add_message'), GlobalVariable.AddResultMessage)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/add_all_button'))

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/update_message'), GlobalVariable.UpdateResultMessage)

WebUI.delay(2)
'點儲存'
WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_button'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_button'))

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/div_'), 0)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/div_'))

WebUI.delay(2)

WebUI.scrollToPosition(50, 50)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/modify_button'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/send_approve_button'), 0)

WebUI.takeScreenshot()

'點送審'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/send_approve_button'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/div__1'), '是否確定送審?')

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/confirm_send_approve_button'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/query_message'), GlobalVariable.QueryResultMessage)
'檢核該資料是待審核階段'
WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/div__2'), '待審核')

