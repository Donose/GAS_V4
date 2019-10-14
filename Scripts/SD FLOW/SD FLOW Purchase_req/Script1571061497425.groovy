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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebDriver openPurchase = DriverFactory.getWebDriver()

WebElement plus = openPurchase.findElement(By.xpath('html/body/div[4]/div[3]/div/div/ul[28]/li/div/button/b')).click()

WebUI.delay(1)

WebDriver openPOR = DriverFactory.getWebDriver()

WebElement por = openPOR.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[28]/li/ul/li[2]/div/a')).click()

CustomKeywords.'linkers.Link.purchaseReq'()



