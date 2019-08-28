package mainDashboardSelections

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

public class Selectors {

	@Keyword
	def selectPOR(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Purchasing'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Purchasing/a_Add Purchase Requisition'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectOTmeeting(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Organisational Tools'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Organisational Tools/a_Add Internal Meeting'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectSDMeeting(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_SD'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/SD/a_Add New Meeting'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectWHinboundAdd(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Warehouse'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Warehouse/a_Add Inbound Delivery'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectWHoutbound(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Warehouse'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Warehouse/a_Add Outbound Delivery'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectWHtransfer(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Warehouse'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Warehouse/a_Add Transfer'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectPMcheckPrice(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_PM  CS'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/PM_CS/a_Check Price'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectPMaddFunctionalLocation(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_PM  CS'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/PM_CS/a_Add Functional Location'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectPMmobileService(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_PM  CS'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/PM_CS/a_Add Mobile Service Notification'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectPMaddNewEQ(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_PM  CS'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/PM_CS/a_Add New Equipment'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectPMstaticService(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_PM  CS'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/PM_CS/a_Add Static Service Notification'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectHRaddEmployee(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_HR'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/HR/a_Add Employee'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectHRleaveReq(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_HR'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/HR/a_Add New Leave Request'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectAccDailyRates(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Accounting'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Accounting/a_Change Daily Rates'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectAccaddCashReq(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Accounting'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Accounting/a_Add Cash Request'), FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	def selectAccaddMonetaryReq(){
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/a_Accounting'))
		WebUI.click(findTestObject('MainDashboard/Nav_Menu_Top/Accounting/a_Add Monetary Request'), FailureHandling.STOP_ON_FAILURE)
	}
}
