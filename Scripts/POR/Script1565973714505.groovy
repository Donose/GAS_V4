import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.apache.commons.lang.RandomStringUtils as RandStr
import java.util.Random as Random

WebUI.openBrowser('')

WebUI.navigateToUrl('http://82.76.235.88:7946/?#!/')

CustomKeywords.'randomNumber.generateNumber.createPor'()

CustomKeywords.'randomNumber.generateNumber.selectSuperv'()

CustomKeywords.'randomNumber.generateNumber.selectDepartment'()

CustomKeywords.'randomNumber.generateNumber.selectPrio'()

CustomKeywords.'randomNumber.generateNumber.selectProvider'()

WebUI.selectOptionByLabel(findTestObject('POR/select_WH'), 'Warehouse number 1', false)

CustomKeywords.'randomNumber.generateNumber.inputDeadline'()

CustomKeywords.'randomNumber.generateNumber.selectMaterial'()

WebUI.takeScreenshot()

