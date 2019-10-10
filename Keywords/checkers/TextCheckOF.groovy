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

public class TextCheckOF {

	@Keyword
	def checkMyTxt(){
		if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME1'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF1'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME2'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME3'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF3'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME4'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF4'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME5'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF5'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME6'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF6'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME7'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF7'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME8'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF8'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME9'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF9'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME10'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF10'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME11'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF11'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME12'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF12'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME13'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF13'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME14'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF14'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME15'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF15'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME16'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF16'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME17'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF17'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME18'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF18'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME19'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF19'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME20'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF20'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME21'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF21'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME22'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF22'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME23'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF23'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME24'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF24'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME25'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF25'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME26'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF26'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME27'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF27'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME28'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF28'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME29'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF29'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME30'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF30'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME31'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF31'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME32'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF32'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME33'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF33'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME34'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF34'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME35'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF35'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME36'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF36'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME37'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF37'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME38'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF38'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME39'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF39'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME40'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF40'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME41'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF41'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME42'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF42'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME43'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF43'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME44'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF44'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME45'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF45'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME46'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF46'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From M47'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF47'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME48'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF48'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME49'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF49'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME50'), 'From ' + findTestData('Test Data').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF50'))
		}
	}

	@Keyword
	def checkMyTextCT(){
		if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT1'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT1'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT3'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT3'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT4'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT4'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT5'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT5'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT6'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT6'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Test Data').getValue(1, 2),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}
	}
}