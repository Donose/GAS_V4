package checkers



import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class IDlessPickWH {
	
	@Keyword
	def pick_from_warehouse_qtty(){
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement ammount = driver.findElement(By.xpath('Object Repository/OR/Open-SendtoConfirm/input_whQtty'))
		String orderAmount = String.valueOf(ammount)
		println('Client ordered: '+orderAmount)
		
		
		
	}
}
