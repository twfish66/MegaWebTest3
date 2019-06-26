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

'DB先進行資料update動作'

'可以用總公司統編當條件，把關聯的總公司-特店-分店-端末-使用者清除'

'請將統編53920879替換為欲清除的總公司統編，需依序執行。'
CustomKeywords.'com.database.sql.connectDB'('192.168.30.94', '1433', 'ewallet_mega_phase1', 'sa', '1qaz@WSX3edc')

'清除 seller_master'
CustomKeywords.'com.database.sql.execute'('delete from seller_master where se_company_id IN (select c_id from company where c_fein = \'53920879\')')

'清除 consumption_merchant_branch_term_audit'
CustomKeywords.'com.database.sql.execute'('delete from consumption_merchant_branch_term_audit where cmbta_cmba_id IN (select cmba_id from consumption_merchant_branch_audit where cmba_cma_id IN (select cma_id from consumption_merchant_audit where cma_merchant_tmp_id IN (select cm_id from consumption_merchant where cm_company_id IN (select c_id from company where c_fein = \'53920879\'))))')

'清除 consumption_merchant_branch_term'
CustomKeywords.'com.database.sql.execute'('delete from consumption_merchant_branch_term where cmbt_cmb_id IN (select cmb_id from consumption_merchant_branch where cmb_merchant_id IN (select cm_id from consumption_merchant where cm_company_id IN (select c_id from company where c_fein = \'53920879\')))')

'清除 consumption_merchant_branch_audit'
CustomKeywords.'com.database.sql.execute'('delete from consumption_merchant_branch_audit where cmba_cma_id IN (select cma_id from consumption_merchant_audit where cma_merchant_tmp_id IN (select cm_id from consumption_merchant where cm_company_id IN (select c_id from company where c_fein = \'53920879\')))')

'清除 consumption_merchant_branch'
CustomKeywords.'com.database.sql.execute'('delete from consumption_merchant_branch where cmb_merchant_id IN (select cm_id from consumption_merchant where cm_company_id IN (select c_id from company where c_fein = \'53920879\'))')

'清除 consumption_merchant_audit'
CustomKeywords.'com.database.sql.execute'('delete from consumption_merchant_audit where cma_merchant_tmp_id IN (select cm_id from consumption_merchant where cm_company_id IN (select c_id from company where c_fein = \'53920879\'))')

'清除 consumption_merchant'
CustomKeywords.'com.database.sql.execute'('delete from consumption_merchant where cm_company_id IN (select c_id from company where c_fein = \'53920879\')')

'清除 company_audit'
CustomKeywords.'com.database.sql.execute'('delete from company_audit where  ca_c_id IN (select c_id from company where c_fein = \'53920879\')')

'清除 company'
CustomKeywords.'com.database.sql.execute'('delete from company where c_fein = \'53920879\'')

'清除 未審核之company_audit'
CustomKeywords.'com.database.sql.execute'('delete from company_audit where ca_fein = \'53920879\'')

CustomKeywords.'com.database.sql.closeDatabaseConnection'()

WebUI.delay(2)

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

WebUI.delay(2)

'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)

'點總公司資料管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Headquater_Info_Manage/headquater_info_menu'))

WebUI.delay(2)

WebUI.takeScreenshot()

'點新增按鈕'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/add_button'))

WebUI.delay(2)

if (GlobalVariable.UserScriptorKeyin == 1) {
    fein_id = '53920879'
} else if (GlobalVariable.UserScriptorKeyin == 2) {
    fein_id = CustomKeywords.'com.example.WebUICustomKeywords.promptMesg'('請輸入要新增的統編')
}

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input__ca_fein'), fein_id)

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input__ca_name'), '回歸測試總公司')

'QRCODE行動支付系統'
WebUI.selectOptionByValue(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/select_'), 'Y', 
    true)

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_QR Code_ca_admin_email'), 
    'tw@gmail.com')

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input__ca_admin_mobile'), 
    '0977878333')

'串接註記'
WebUI.selectOptionByValue(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/select__1'), 
    'Y', true)

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_IP_ca_source_ip'), 
    '10.10.10.10')

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_()_ca_pos_url'), 'http://a.b.c.fd')

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_()_ca_neg_url'), 'http://a.b.c.fg')

'使否設定對帳資訊'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input__ca_is_set_bank_statement_y'))

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input__ca_bank_statement_email'), 
    'bb@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/select_FTPSFTP'), 
    'FTP', true)

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_(IP)_ca_ftp_ip'), 
    '10.10.10.10')

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_(Port)_ca_ftp_port'), 
    '21')

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_()_ca_ftp_account'), 
    'bb')

WebUI.setEncryptedText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input_()_ca_ftp_password'), 
    '5SS5sXGxylg=')

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/save_button'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/div_17392037'))

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/modify_button'))

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Headquater_Info_Manage/send_approve_button'), 0)

'點送審'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/send_approve_button'))

not_run: WebUI.verifyElementText(findTestObject('Bank_manage/Store_manage/Headquater_Info_Manage/div_confirm_approve'), 
    GlobalVariable.SendApproveConfirmMessage)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Headquater_Info_Manage/send_appve_confirm_button1'))

WebUI.setText(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/input__searchca_fein'), 
    fein_id)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/query_button'))

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/div__1'))

WebUI.scrollToPosition(50, 50)

'點明細'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/deltail_button'))

WebUI.delay(2)

'點確定'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/cancel_button'))

WebUI.delay(2)

'點清除'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/clear_button'))

WebUI.delay(2)

'選擇未送審'
WebUI.selectOptionByValue(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/select_no_send_approve'), 
    '0', true)

WebUI.delay(2)

'點查詢'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/query_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/div_27235901'))

WebUI.delay(2)

'點刪除'
WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/delete_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bank_manage/Store_manage/Headquater_Info_Manage/confirm_delete_button'))

