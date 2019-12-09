import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('MainDashboard/Nav_Menu_Top/a_PM  CS'), 10)

CustomKeywords.'mainDashboardSelections.Selectors.selectPMmobileService'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.selectOptionByLabel(findTestObject('MSN/MSN Manual/Administrative MSN/select_MSN_Type'), 'Administrative Service', 
    false)

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.selectOptionByLabel(findTestObject('MSN/MSN Manual/Administrative MSN/select_Issue_Type'), 'Mobile Team', false)

WebUI.selectOptionByLabel(findTestObject('MSN/MSN Manual/Administrative MSN/select_Assignee'), 'Donose Andrei', false)

WebUI.selectOptionByLabel(findTestObject('MSN/MSN Manual/Administrative MSN/select_Priority'), 'Medium', false)

WebUI.click(findTestObject('MSN/MSN Manual/Administrative MSN/input_Deadline'))

WebUI.click(findTestObject('MSN/MSN Manual/Administrative MSN/input_Deadline_today'))

WebUI.click(findTestObject('MSN/MSN Manual/Administrative MSN/input_Deadline_done'))

WebUI.click(findTestObject('MSN/MSN Manual/Administrative MSN/input_Client'))

WebUI.click(findTestObject('MSN/MSN Manual/Administrative MSN/span_Select company'))

WebUI.setText(findTestObject('MSN/MSN Manual/Administrative MSN/input_Select company'), client)

WebUI.sendKeys(findTestObject('MSN/MSN Manual/Administrative MSN/input_Select company'), Keys.chord(Keys.ENTER))

