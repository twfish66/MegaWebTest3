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

WebUI.delay(2)

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

'點店家管理'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_info_manage_add/store_manage'))

WebUI.delay(1)

'點店家資料審核'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_Info_Approve/Store_Info_Approve'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('Bank_manage/Store_manage/Store_Info_Approve/approve_status'), '待審核', false)

'點查詢'
WebUI.click(findTestObject('Bank_manage/Common_Use/query_button'))

WebUI.verifyElementText(findTestObject('Merchant_Manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Bank_manage/Store_manage/Store_Info_Approve/div_017969799330012'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_Info_Approve/div_017969799330012'))

WebUI.scrollToPosition(50, 50)

'點核准'
WebUI.click(findTestObject('Bank_manage/Common_Use/check_button'))

WebUI.scrollToElement(findTestObject('Bank_manage/Common_Use/approve_button'), 0)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Bank_manage/Common_Use/approve_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/approve_confirm_message'), '是否確定核准?')

WebUI.delay(2)

'點核准'
WebUI.click(findTestObject('Bank_manage/Common_Use/approve_comfirm_button'))

WebUI.delay(2)

'點清除'
WebUI.click(findTestObject('Bank_manage/Common_Use/clear_button'))

WebUI.selectOptionByLabel(findTestObject('Bank_manage/Store_manage/Store_Info_Approve/approve_status'), '已核准', false)

WebUI.click(findTestObject('Bank_manage/Common_Use/query_button'))

WebUI.click(findTestObject('Bank_manage/Store_manage/Store_Info_Approve/div_017969799330012'))

WebUI.delay(2)

'點同步'
WebUI.click(findTestObject('Bank_manage/Store_manage/Store_Info_Approve/syc_button'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/syc_suc_message'), '核可成功。')

