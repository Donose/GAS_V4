package checkers

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

public class RadioButton {

	@Keyword
	def OwnCompany(){
		if (WebUI.verifyElementText(findTestObject('OF/Status In Progress/Radio buttons/span_Own Companies'), 'Own Companies')==true){
			WebUI.check(findTestObject('OF/Status In Progress/Radio buttons/input_Own Companies'))
		}
	}
	@Keyword
	def ClientCompanies(){
		if (WebUI.verifyElementText(findTestObject('OF/Status In Progress/Radio buttons/span_Office'), 'Office')==true){
			WebUI.check(findTestObject('OF/Status In Progress/Radio buttons/input_Office'))
		}
	}
	@Keyword
	def Office(){
		if (WebUI.verifyElementText(findTestObject('OF/Status In Progress/Radio buttons/span_Office'), 'Office')==true){
			WebUI.check(findTestObject('OF/Status In Progress/Radio buttons/input_Office'))
		}
	}
	@Keyword
	def Gaming(){
		if (WebUI.verifyElementText(findTestObject('OF/Status In Progress/Radio buttons/span_Gaming Hall'), 'Gaming Hall')==true){
			WebUI.check(findTestObject('OF/Status In Progress/Radio buttons/input_Gaming Hall'))
		}
	}
	@Keyword
	def Warehouse(){
		if (WebUI.verifyElementText(findTestObject('OF/Status In Progress/Radio buttons/span_Warehouse'), 'Warehouse')==true){
			WebUI.check(findTestObject('OF/Status In Progress/Radio buttons/input_Warehouse'))
		}
	}
	@Keyword
	def BetShop(){
		if (WebUI.verifyElementText(findTestObject('OF/Status In Progress/Radio buttons/span_Bet Shop'), 'Bet Shop')==true){
			WebUI.check(findTestObject('OF/Status In Progress/Radio buttons/input_Bet Shop'))
		}
	}
}
