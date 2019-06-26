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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import groovy.time.TimeCategory as TimeCategory

'選擇執行的功能'
chooselist = CustomKeywords.'com.example.WebUICustomKeywords.dropDownList'(null)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.30.94:8080/ewallet-manage/login?lightID=QRMP01')

WebUI.maximizeWindow()

'首頁總攬'
WebUI.click(findTestObject('Bank_manage/Common_Use/homepage'))

//func = 1
for (def index : (1..5)) {
    if (chooselist == findTestData('New Test Data').getValue(2, index)) {
        func_string = findTestData('New Test Data').getValue(1, index)

        func = func_string.toInteger()
    }
}

//WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/daily_recorder_menu'))
'控制進入的節狀目錄'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/' + findTestData('New Test Data').getValue(3, 
            func)))

WebUI.delay(1)

//WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/mail_sent_menu'))
'執行的功能'
WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/' + findTestData('New Test Data').getValue(4, 
            func)))

WebUI.delay(2)

WebUI.takeScreenshot()

for (def index : (1..5)) {
    '執行查詢動作'
    if (findTestData('function').getValue(2, index) == 'Query') {
        if (findTestData('function').getValue(4, index) == 'selectOptionByLabel') {
            WebUI.selectOptionByLabel(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/' + findTestData('function').getValue(
                        5, index)), findTestData('function').getValue(6, index), false)

            //WebUI.selectOptionByLabel(findTestObject('Bank_manage/Daily_Recoder/Sent_Mail_Daily_Query/sent_result'), '成功', false)
            WebUI.delay(1 //WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/test/input__toEmail'), 'test@gmail.com,name')
                )
        } else if (findTestData('function').getValue(4, index) == 'setText') {
            WebUI.setText(findTestObject('Bank_manage/Daily_Recoder/test/' + findTestData('function').getValue(5, index)), 
                findTestData('function').getValue(6, index))

            WebUI.delay(1)
        }
        
        if (findTestData('function').getValue(2, index + 1) != 'Query') {
            '查詢'
            WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/query_button'))

            WebUI.verifyElementText(findTestObject('Bank_manage/Common_Use/Messagebox/query_message'), GlobalVariable.QueryResultMessage)

            WebUI.delay(1)
        }
    }
    
    '執行明細動作'
    if (findTestData('function').getValue(2, index) == 'Detail') {
        WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/div_qryLoveCode'))

        WebUI.scrollToPosition(50, 50)

        '明細'
        WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/detail_button'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(2)

        get_result = WebUI.getText(findTestObject('Bank_manage/Daily_Recoder/test/' + findTestData('function').getValue(
                    5, index)), FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyEqual(get_result, findTestData('function').getValue(6, index))

        if (findTestData('function').getValue(2, index + 1) != 'Detail') {
            WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Outside_Daily_Query/detail_ok_button'))

            WebUI.delay(2)
        }
    }
    
    '執行清除動作'
    if (findTestData('function').getValue(2, index) == 'Clear') {
        '清除'
        WebUI.click(findTestObject('Bank_manage/Daily_Recoder/Operate_Daily_Query/clear_button'))

        WebUI.delay(1)

        WebUI.verifyElementText(findTestObject('Bank_manage/Daily_Recoder/test/' + findTestData('function').getValue(5, 
                    index)), findTestData('function').getValue(6, index))
    }
}

