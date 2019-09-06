package randomNumber

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class RandomDropDownProjectInfo {
	@Keyword
	def randomPOR(){
		randomPrio()
		randomSupervisor()
		randomDepartment()
	}

	def randomPrio(){
		int optionListLength = 4
		Random rand = new Random()
		int indexP = rand.nextInt(optionListLength )
		WebUI.selectOptionByIndex(findTestObject('POR_V2/Project Information/select_Prio'), indexP)
	}

	def randomSupervisor(){
		int optionListLength = 4
		Random rand = new Random()
		int indexS = rand.nextInt(optionListLength )
		WebUI.selectOptionByIndex(findTestObject('POR_V2/Project Information/select_Supervisor'), indexS)
	}

	def randomDepartment(){
		int optionListLength = 12
		Random rand = new Random()
		int indexD = rand.nextInt(optionListLength )
		WebUI.selectOptionByIndex(findTestObject('POR_V2/Project Information/select_Department'), indexD)
	}
	def randomSAPnumber(){
		Random rand =new Random()
		int n = rand.nextInt(999999)
		WebUI.setText(findTestObject('POR_V2/Content Information/input_SAP Number'), String.valueOf(n))
	}
	def randomQUOnumber(){
		Random rand =new Random()
		int n = rand.nextInt(999999)
		WebUI.setText(findTestObject('POR_V2/Content Information/input_Quotation Number'), String.valueOf(n))
	}
	def randomQA(){
		Random rand = new Random()
		int n = rand.nextInt(15)
		WebUI.setText(findTestObject('POR_V2/Content Information/Materials/input_Quantity'), String.valueOf(n))
	}
}
