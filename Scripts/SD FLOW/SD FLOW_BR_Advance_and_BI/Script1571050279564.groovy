import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebDriver bilingOpen = DriverFactory.getWebDriver()

WebElement plus = bilingOpen.findElement(By.xpath(' /html/body/div[4]/div[3]/div/div/ul[29]/li/div/button/b')).click()

WebUI.delay(2)

WebDriver billingElem = DriverFactory.getWebDriver()

WebElement billing = billingElem.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[29]/li/ul/li[1]/div/a')).click()

WebUI.delay(2)

CustomKeywords.'linkers.Link.BR'()

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('BR/select_Generate Billing'), 1)

WebUI.click(findTestObject('BR/input_InProgress'))

WebUI.delay(1)

WebDriver notificationBI = DriverFactory.getWebDriver()

String NotificationBi = notificationBI.findElement(By.xpath('/html/body/div[4]/div[1]')).getText().substring(0, 6)

println(NotificationBi)

CustomKeywords.'outputExcel.NotificationOutput.writeBI'(NotificationBi, 'Billing inv')

WebUI.setText(findTestObject('BI/input__form_invoiceNR'), String.valueOf(Math.abs(new Random().nextInt() % 9999) + 1))

String invoiceDateNow = CustomKeywords.'dates.DateGenerate.date'()

WebUI.setText(findTestObject('BI/input__form_DATE'), invoiceDateNow)

WebUI.selectOptionByIndex(findTestObject('BI/select_TYPE'), 1)

WebUI.selectOptionByIndex(findTestObject('BI/select_reason'), 1)

WebUI.selectOptionByIndex(findTestObject('BI/select_CURRENCY'), 1)

WebUI.selectOptionByIndex(findTestObject('BI/select_CASH_TRANSFER'), 1)

WebUI.click(findTestObject('BI/input_Billing'))

WebUI.delay(1)

WebDriver driverRE = DriverFactory.getWebDriver()

String NotificationRE = driverRE.findElement(By.xpath('/html/body/div[4]/div[1]')).getText().substring(18, 24)

println(NotificationRE)

CustomKeywords.'outputExcel.NotificationOutput.writeRE'(NotificationRE, 'Receivables')

WebUI.delay(2)

WebDriver driverMD = DriverFactory.getWebDriver()

WebElement mainDashboard = driverMD.findElement(By.xpath('/html/body/div[4]/div[3]/div/div/ul[7]/li/div/a')).click()

