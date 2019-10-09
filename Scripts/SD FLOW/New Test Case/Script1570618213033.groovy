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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://deploy.egt-bg.ro:7946/?#!/')

WebUI.setText(findTestObject('Login/input_username'), 'daniel.donose')

WebUI.setText(findTestObject('Login/input_password'), '11111sase')

WebUI.click(findTestObject('Login/button_Login'))

WebUI.delay(5)

CustomKeywords.'mainDashboardSelections.Selectors.selectAccDailyRates'()

WebUI.setText(findTestObject('DailyRates/input_RON'), '4.7')

WebUI.setText(findTestObject('DailyRates/input_BGN'), '2.3')

WebUI.setText(findTestObject('DailyRates/input_USD'), '4.4')

WebUI.click(findTestObject('DailyRates/input_Save'))

WebUI.waitForElementPresent(findTestObject('MainDashboard/Nav_Menu_Top/a_SD'), 10)

CustomKeywords.'mainDashboardSelections.Selectors.selectSDMeeting'()

WebUI.delay(10)

WebUI.selectOptionByIndex(findTestObject('ME/select_me_prio'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ME/span_Company name'))

WebUI.setText(findTestObject('ME/input_Company name'), 'COMPANY TEST', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ME/input_Company name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ME/span_Contact name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ME/input_Contact name'), 'admin1')

WebUI.sendKeys(findTestObject('ME/input_Contact name'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('ME/select_Meeting'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Deal'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Location'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Opportunity'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ME/select_Purpose'), 1, FailureHandling.STOP_ON_FAILURE)

String date = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.setText(findTestObject('Object Repository/ME/DatePick/input_Meeting date'), date, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ME/Client Products/span_Client interested in products'), 5)

WebUI.setText(findTestObject('ME/Client Products/input_Quantty'), '4')

WebUI.click(findTestObject('ME/Client Products/span_Select material'))

WebUI.setText(findTestObject('ME/Client Products/input_Materials'), 'Gaming_machine1')

WebUI.sendKeys(findTestObject('ME/Client Products/input_Materials'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByIndex(findTestObject('ME/Client Products/select_DealTypeForMaterial'), 1)

WebUI.click(findTestObject('ME/button_Create Offer'))

String Meeting = WebUI.getText(findTestObject('Notifications/ME-OF/div_Meeting ME')).substring(8, 14)

CustomKeywords.'outputExcel.MeetingOutput.write'(Meeting, 'Meeting')

System.out.println(Meeting)

WebUI.delay(5)

CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.click(findTestObject('SO/Status Open/input_Sale Offer_Open'))

WebUI.delay(5)

String dateVal = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Offer Validity_Date'), dateVal)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Discount'), '')

WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Advance - Pay'), '20')

String dateAdvance = CustomKeywords.'dates.DateGenerate.dateWeek'()

WebUI.sendKeys(findTestObject('SO/Status In Progress/input_First Advance Payment (deadline)'), dateAdvance)

WebUI.selectOptionByIndex(findTestObject('SO/Status In Progress/select_Installments'), 5)

'TO BE MADE'
not_run: WebUI.sendKeys(findTestObject('SO/Status In Progress/input_Interest'), '')

WebUI.click(findTestObject('SO/Status In Progress/Calculate'))

CustomKeywords.'checkers.RadioButton.OwnCompany'()

WebUI.selectOptionByIndex(findTestObject('SO/Status In Progress/select_Company'), 1)

CustomKeywords.'checkers.RadioButton.Warehouse'()

WebUI.selectOptionByLabel(findTestObject('SO/Status In Progress/Warehouse/select_Warehouse'), 'Warehouse number 1', false)

WebUI.click(findTestObject('SO/Status In Progress/input_Sale Offer_SendForConfirmation'))

WebUI.delay(5)

CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.delay(2)

WebUI.click(findTestObject('SO/Status Sale Confirmation/input_Sale Offer_Confirm'))

WebUI.delay(5)

CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.click(findTestObject('SO/Status Sale Confirmation/input_Sale Offer_Confirm'))

WebUI.delay(5)

not_run: CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.click(findTestObject('SO/Status Sale Confirmation/input_Sale Offer_Confirm'))

WebUI.delay(5)

CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.click(findTestObject('SO/Status Sale Confirmation/Client/input_Sale Offer_Client'))

WebUI.delay(5)

CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.click(findTestObject('SO/Status Sale Confirmation/Client/input_Sale Offer_Client'))

WebUI.delay(5)

CustomKeywords.'checkers.TextCheckOF.checkMyTxt'()

WebUI.click(findTestObject('null'))

