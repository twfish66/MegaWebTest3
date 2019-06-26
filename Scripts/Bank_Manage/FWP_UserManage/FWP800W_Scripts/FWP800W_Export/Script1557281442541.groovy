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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://192.168.30.94:8080/ewallet-manage/login?lightID=QRMP01')

not_run: WebUI.maximizeWindow()

'點選menu-首頁總覽'
WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_QRCode/span_DashboardMenu'))

WebUI.delay(1)

'點選menu-使用者管理'
WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_QRCode/span_UserManage'))

WebUI.delay(1)

'點選menu-FWP800W 角色群組管理'
WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_QRCode/span_RoleGroupManage'))

WebUI.delay(2)

'按下匯出'
WebUI.click(findTestObject('Object Repository/FWP_UserManage/FWP800W_ImportExport/Page_FWP800W -/button_Export'))

WebUI.delay(5)

'Define Custom Path where file needs to be downloaded'
not_run: String downloadPath = 'C:\\Users\\CHT-User\\Downloads'

'Define the filename needs to be downloaded'
not_run: String downloadFile = '角色權限.xlsx'

not_run: WebDriver driver = DriverFactory.getWebDriver()

'Wait for Some time so that file gets downloaded and Stored in user defined path'
not_run: WebUI.delay(10)

'Verifying the file is download in the User defined Path'
not_run: Assert.assertTrue(isFileDownloaded(downloadPath, downloadFile), 'Failed to download Expected document') // remove this line if you want to keep the file

boolean isFileDownloaded(String downloadPath, String fileName) {
    not_run: long timeout = (5 * 60) * 1000

    not_run: long start = new Date().getTime()

    not_run: boolean downloaded = false

    not_run: File file = new File(downloadPath, fileName)

    not_run: while (!(downloaded)) {
        downloaded = file.exists()

        if (downloaded) {
            file.delete()
        } else {
            long now = new Date().getTime()

            if ((now - start) > timeout) {
                break
            }
            
            Thread.sleep(3000)
        }
    }
    
    not_run: return downloaded
}

