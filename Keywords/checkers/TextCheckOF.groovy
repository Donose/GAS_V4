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
		if ( WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME1'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF1'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME2'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME3'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF3'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME4'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF4'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME5'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF5'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME6'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF6'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME7'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF7'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME8'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF8'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME9'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF9'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME10'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF10'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME11'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF11'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME12'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF12'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME13'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF13'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME14'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF14'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME15'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF15'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME16'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF16'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME17'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF17'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME18'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF18'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME19'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF19'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME20'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF20'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME21'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF21'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME22'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF22'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME23'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF23'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME24'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF24'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME25'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF25'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME26'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF26'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME27'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF27'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME28'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF28'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME29'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF29'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME30'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF30'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME31'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF31'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME32'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF32'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME33'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF33'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME34'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF34'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME35'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF35'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME36'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF36'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME37'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF37'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME38'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF38'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME39'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF39'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME40'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF40'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME41'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF41'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME42'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF42'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME43'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF43'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME44'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF44'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME45'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF45'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME46'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF46'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME47'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF47'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME48'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF48'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME49'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF49'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME50'), 'From ' + findTestData('Process numbers').getValue(
		1, 1),FailureHandling.OPTIONAL) == true){
			WebUI.click(findTestObject('Link Processes/ME to SO/button_OF50'))
		}
	}

	@Keyword
	def checkMyTextCT(){
		if (WebUI.verifyElementText(findTestObject('Link Processes/ME to SO/span_From ME1'),'From '+ findTestData('Process numbers').getValue(2, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT1'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT2'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT2'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT3'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT3'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT4'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT4'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT5'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT5'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT6'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT6'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT7'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT7'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT8'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT8'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT9'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT9'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT10'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT10'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT11'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT11'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT12'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT12'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT13'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT13'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT14'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT14'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT15'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT15'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT16'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT16'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT17'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT17'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT18'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT18'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT19'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT19'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT20'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT20'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT21'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT21'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT22'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT22'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT23'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT23'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT24'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT24'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT25'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT25'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT26'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT26'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT27'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT27'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT28'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT28'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT29'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT29'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT30'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT30'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT31'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT31'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT32'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT32'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT33'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT33'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT34'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT34'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT35'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT35'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT36'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT36'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT37'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT37'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT38'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT38'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT39'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT39'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT40'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT40'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT41'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT41'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT42'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT42'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT43'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT43'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT44'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT44'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT45'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT45'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT46'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT46'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT47'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT47'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT48'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT48'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT49'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT49'))
		}else if (WebUI.verifyElementText(findTestObject('Link Processes/SO-CT/button_CT50'), findTestData('Process numbers').getValue(3, 1),FailureHandling.OPTIONAL)==true){
			WebUI.click(findTestObject('Link Processes/SO-CT/button_CT50'))
		}
	}
}
