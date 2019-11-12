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


final String waitLoad = 'Waiters/WaitLoadingAnim_Element'
final String waitButton = 'Waiters/WaitButton_Element'
final String waitDirector = 'OF/Status Sale Confirmation/Sale Director/input_Sale Offer_director'
final String waitRODirector = 'OF/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'
final String waitBGDirector = 'OF/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'
final String waitClient = 'OF/Status Sale Confirmation/Client/input_Sale Offer_Client'

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW_IDless.offer'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitDirector), 20)

WebUI.waitForElementClickable(findTestObject(waitDirector), 20)

WebUI.click(findTestObject(waitDirector))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW_IDless.offer'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitRODirector), 20)

WebUI.waitForElementClickable(findTestObject(waitRODirector), 20)

WebUI.click(findTestObject(waitRODirector))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

CustomKeywords.'linkers.Link_SD_FLOW_IDless.offer'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitBGDirector), 20)

WebUI.waitForElementClickable(findTestObject(waitBGDirector), 20)

WebUI.click(findTestObject(waitBGDirector))

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitButton), 20)

WebUI.waitForElementClickable(findTestObject(waitButton), 20)

WebUI.delay(1)

CustomKeywords.'linkers.Link_SD_FLOW_IDless.offer'()

WebUI.waitForElementNotVisible(findTestObject(waitLoad), 20)

WebUI.waitForElementVisible(findTestObject(waitClient), 20)

WebUI.waitForElementClickable(findTestObject(waitClient), 20)

WebUI.click(findTestObject(waitClient))

