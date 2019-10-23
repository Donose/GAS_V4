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

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('SO/Status Sale Confirmation/Sale Director/input_Sale Offer_director'), 20)

WebUI.waitForElementClickable(findTestObject('SO/Status Sale Confirmation/Sale Director/input_Sale Offer_director'), 20)

WebUI.click(findTestObject('SO/Status Sale Confirmation/Sale Director/input_Sale Offer_director'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('SO/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'), 
    20)

WebUI.waitForElementClickable(findTestObject('SO/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'), 
    20)

WebUI.click(findTestObject('SO/Status Sale Confirmation/EGT Romania Director/input_Sale Offer_RODirector'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('SO/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'), 
    20)

WebUI.waitForElementClickable(findTestObject('SO/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'), 
    20)

WebUI.click(findTestObject('SO/Status Sale Confirmation/EGT Bulgaria Director/input_Sale Offer_BGDirector'))

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('Waiters/WaitButton_Element'), 20)

WebUI.waitForElementClickable(findTestObject('Waiters/WaitButton_Element'), 20)

CustomKeywords.'linkers.Link.offer'()

WebUI.waitForElementNotVisible(findTestObject('Waiters/WaitLoadingAnim_Element'), 20)

WebUI.waitForElementVisible(findTestObject('SO/Status Sale Confirmation/Client/input_Sale Offer_Client'), 20)

WebUI.waitForElementClickable(findTestObject('SO/Status Sale Confirmation/Client/input_Sale Offer_Client'), 20)

WebUI.click(findTestObject('SO/Status Sale Confirmation/Client/input_Sale Offer_Client'))

