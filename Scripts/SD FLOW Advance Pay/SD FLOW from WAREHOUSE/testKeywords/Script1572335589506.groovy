import org.openqa.selenium.By

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

CustomKeywords.'checkers.CheckBox.from_warehouse_checkbox'()
WebDriver driverTable = DriverFactory.getWebDriver()

driverTable.findElement(By.xpath("//td[7]/input")).click()

