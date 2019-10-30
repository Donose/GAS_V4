package checkers

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class CheckBox {

	@Keyword
	def from_warehouse_checkbox(){
		WebDriver driverTable = DriverFactory.getWebDriver()
		WebElement table = driverTable.findElement(By.xpath('/html/body/div[7]/div[1]/div/form/table[2]'))
		WebElement ammount = driverTable.findElement(By.xpath("/html/body/div[7]/div[1]/div/form/table[1]/tbody/tr[1]/td"))
		WebElement selected_ammount = driverTable.findElement(By.xpath('/html/body/div[7]/div[1]/div/form/table[1]/tbody/tr[2]/td'))
		//List<WebElement> checkBoxes = driverTable.findElements(By.xpath('//*/[@ng-init]'))
		String quantity = ammount.getText()
		String selected_total = selected_ammount.getText()
		int q = Integer.parseInt(quantity)
		int a = Integer.parseInt(selected_total)
		//println(checkBoxes.size())
		println("Client ordered: "+q+" and there are: "+a+" selected")
		List<WebElement> rows_table = table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size
		for (int row = 0; row < rows_count; row++){
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
			int columns_count = Columns_row.size()
            for (int column = 0; column < columns_count; column++){
				while (q>a){

					rows_table.get(row).findElement(By.xpath('//td[7]/input[@type="checkbox"]')).click()
					a++
					
				}
				break
			}
		}
	}	
}


