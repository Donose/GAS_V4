package ammounts

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class ammount {
	@Keyword
	def multiple_materials_me(){
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement plus = driver.findElement(By.xpath("//button[@ng-click = 'templateController.addProduct()' and (text() = '+' or . = '+')]"))
		for(int i = 0;i=3;i++){
       plus.click()
		}
	}
}
