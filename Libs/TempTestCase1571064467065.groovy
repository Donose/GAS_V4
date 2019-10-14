import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\DANIEL~1.DON\\AppData\\Local\\Temp\\Katalon\\Test Cases\\SD FLOW\\SD FLOW Purchase_req\\20191014_174747\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.delay(1)

not_run: WebDriver openPurchase = DriverFactory.getWebDriver()

not_run: WebElement plus = openPurchase.findElement(By.xpath('html/body/div[4]/div[3]/div/div/ul[28]/li/div/button/b')).click()

not_run: WebUI.delay(1)

//WebUI.scrollToElement( 2600,570)
not_run: WebUI.delay(1)

WebDriver openPOR = DriverFactory.getWebDriver()

WebUI.scrollToElement(openPOR.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[28]/li/ul/li[2]/div/a'), 1))

WebElement por = openPOR.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[28]/li/ul/li[2]/div/a')).click()

CustomKeywords.'linkers.Link.purchaseReq'()

''', 'Test Cases/SD FLOW/SD FLOW Purchase_req', new TestCaseBinding('Test Cases/SD FLOW/SD FLOW Purchase_req',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
