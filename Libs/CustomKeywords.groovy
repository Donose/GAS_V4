
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import org.apache.poi.ss.usermodel.Workbook

import java.lang.String

import org.apache.poi.ss.usermodel.Sheet

import java.lang.Object

import org.apache.poi.ss.usermodel.Cell

import java.util.List

import org.apache.poi.ss.usermodel.Row

import java.util.Map

import com.kms.katalon.core.testobject.TestObject

import com.kms.katalon.core.model.FailureHandling


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}

def static "com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate"(
    	TestObject to	
     , 	int day	
     , 	int month	
     , 	int year	
     , 	int slideTimeOut	
     , 	FailureHandling flowControl	) {
    (new com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword()).setDate(
        	to
         , 	day
         , 	month
         , 	year
         , 	slideTimeOut
         , 	flowControl)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFile(
        	object
         , 	file)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFileUsingRobot(
        	object
         , 	file)
}

def static "outputExcel.NotificationOutput.write"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).write(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writeOF"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writeOF(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writeCT"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writeCT(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writeBR"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writeBR(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writeBI"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writeBI(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writeRE"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writeRE(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writeOR"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writeOR(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writePOR"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writePOR(
        	name
         , 	Column_Name)
}

def static "outputExcel.NotificationOutput.writePO"(
    	String name	
     , 	String Column_Name	) {
    (new outputExcel.NotificationOutput()).writePO(
        	name
         , 	Column_Name)
}

def static "linkers.Link.contract"() {
    (new linkers.Link()).contract()
}

def static "linkers.Link.offer"() {
    (new linkers.Link()).offer()
}

def static "linkers.Link.billing_request"() {
    (new linkers.Link()).billing_request()
}

def static "linkers.Link.billing"() {
    (new linkers.Link()).billing()
}

def static "linkers.Link.receivables"() {
    (new linkers.Link()).receivables()
}

def static "linkers.Link.order"() {
    (new linkers.Link()).order()
}

def static "linkers.Link.purchase_req"() {
    (new linkers.Link()).purchase_req()
}

def static "linkers.Link.purchase_order"() {
    (new linkers.Link()).purchase_order()
}

def static "linkers.Link.inbound_delivery"() {
    (new linkers.Link()).inbound_delivery()
}

def static "linkers.Link.mobile_service_notification"() {
    (new linkers.Link()).mobile_service_notification()
}

def static "linkers.Link.mobile_service_order"() {
    (new linkers.Link()).mobile_service_order()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDayOfWeek"(
    	String date	
     , 	String dateFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDayOfWeek(
        	date
         , 	dateFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDuration"(
    	String startTime	
     , 	String endTime	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDuration(
        	startTime
         , 	endTime)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentMonth()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentYear()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPastTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPastTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.addDays"(
    	String stringDate	
     , 	String dateFormat	
     , 	int amount	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).addDays(
        	stringDate
         , 	dateFormat
         , 	amount)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDate()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate"(
    	String value	
     , 	String currentFormat	
     , 	String newFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).formatStringDate(
        	value
         , 	currentFormat
         , 	newFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureTime(
        	hrs
         , 	minute)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDefaultTimeZone"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDefaultTimeZone()
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.setDefaultTimeZone"(
    	String timeZoneId	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).setDefaultTimeZone(
        	timeZoneId)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPreviousDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPreviousDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDateTime"(
    	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDateTime(
        	timeZoneId
         , 	dateTimeFormat)
}

def static "com.kms.katalon.keyword.datetime.DateTimeUtility.convertString2Date"(
    	String value	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).convertString2Date(
        	value
         , 	dateTimeFormat)
}

def static "mainDashboardSelections.Selectors.selectPOR"() {
    (new mainDashboardSelections.Selectors()).selectPOR()
}

def static "mainDashboardSelections.Selectors.selectOTmeeting"() {
    (new mainDashboardSelections.Selectors()).selectOTmeeting()
}

def static "mainDashboardSelections.Selectors.selectSDMeeting"() {
    (new mainDashboardSelections.Selectors()).selectSDMeeting()
}

def static "mainDashboardSelections.Selectors.selectWHinboundAdd"() {
    (new mainDashboardSelections.Selectors()).selectWHinboundAdd()
}

def static "mainDashboardSelections.Selectors.selectWHoutbound"() {
    (new mainDashboardSelections.Selectors()).selectWHoutbound()
}

def static "mainDashboardSelections.Selectors.selectWHtransfer"() {
    (new mainDashboardSelections.Selectors()).selectWHtransfer()
}

def static "mainDashboardSelections.Selectors.selectPMcheckPrice"() {
    (new mainDashboardSelections.Selectors()).selectPMcheckPrice()
}

def static "mainDashboardSelections.Selectors.selectPMaddFunctionalLocation"() {
    (new mainDashboardSelections.Selectors()).selectPMaddFunctionalLocation()
}

def static "mainDashboardSelections.Selectors.selectPMmobileService"() {
    (new mainDashboardSelections.Selectors()).selectPMmobileService()
}

def static "mainDashboardSelections.Selectors.selectPMaddNewEQ"() {
    (new mainDashboardSelections.Selectors()).selectPMaddNewEQ()
}

def static "mainDashboardSelections.Selectors.selectPMstaticService"() {
    (new mainDashboardSelections.Selectors()).selectPMstaticService()
}

def static "mainDashboardSelections.Selectors.selectHRaddEmployee"() {
    (new mainDashboardSelections.Selectors()).selectHRaddEmployee()
}

def static "mainDashboardSelections.Selectors.selectHRleaveReq"() {
    (new mainDashboardSelections.Selectors()).selectHRleaveReq()
}

def static "mainDashboardSelections.Selectors.selectAccDailyRates"() {
    (new mainDashboardSelections.Selectors()).selectAccDailyRates()
}

def static "mainDashboardSelections.Selectors.selectAccaddCashReq"() {
    (new mainDashboardSelections.Selectors()).selectAccaddCashReq()
}

def static "mainDashboardSelections.Selectors.selectAccaddMonetaryReq"() {
    (new mainDashboardSelections.Selectors()).selectAccaddMonetaryReq()
}

def static "dates.DatePicker.handleDatepicker"(
    	TestObject calender	
     , 	String exp_Date	
     , 	String exp_Month	
     , 	String exp_Year	) {
    (new dates.DatePicker()).handleDatepicker(
        	calender
         , 	exp_Date
         , 	exp_Month
         , 	exp_Year)
}

def static "checkers.RadioButton.OwnCompany"() {
    (new checkers.RadioButton()).OwnCompany()
}

def static "checkers.RadioButton.ClientCompanies"() {
    (new checkers.RadioButton()).ClientCompanies()
}

def static "checkers.RadioButton.Office"() {
    (new checkers.RadioButton()).Office()
}

def static "checkers.RadioButton.Gaming"() {
    (new checkers.RadioButton()).Gaming()
}

def static "checkers.RadioButton.Warehouse"() {
    (new checkers.RadioButton()).Warehouse()
}

def static "checkers.RadioButton.BetShop"() {
    (new checkers.RadioButton()).BetShop()
}

def static "checkers.TextCheckOF.checkMyTxt"() {
    (new checkers.TextCheckOF()).checkMyTxt()
}

def static "checkers.TextCheckOF.checkMyTextCT"() {
    (new checkers.TextCheckOF()).checkMyTextCT()
}

def static "dates.DateGenerate.date"() {
    (new dates.DateGenerate()).date()
}

def static "dates.DateGenerate.dateWeek"() {
    (new dates.DateGenerate()).dateWeek()
}

def static "dates.DateGenerate.dateWeekAgo"() {
    (new dates.DateGenerate()).dateWeekAgo()
}

def static "VerifySelection.verifyPrio"() {
    (new VerifySelection()).verifyPrio()
}
