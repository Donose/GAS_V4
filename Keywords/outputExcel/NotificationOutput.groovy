package outputExcel

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException
import java.io.FileOutputStream;
import java.io.IOException
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


public class NotificationOutput{

	private  static int i=0;

	@Keyword
	public static void write(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Meeting'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(0,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}

	@Keyword
	public static void writeOF(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Offer'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(1,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
	@Keyword
	public static void writeCT(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Contract'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(2,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
	@Keyword
	public static void writeBR(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Billing req'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(3,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
	@Keyword
	public static void writeBI(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Billing inv'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(4,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
	@Keyword
	public static void writeRE(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Receivables'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(5,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
	@Keyword
	public static void writeOR(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Sale Order'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(6,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
	@Keyword
	public static void writePOR(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Purchase req'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(7,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
	@Keyword
	public static void writePO(String name,String Column_Name) throws IOException{
		FileInputStream fis = new FileInputStream("./Data Files/processes.xlsx")
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet("data")
		int rowCount = i
		if (Column_Name=='Purchase order'){
			Row row = sheet.getRow(rowCount+1)
			Cell cell = row.createCell(8,0)
			cell.setCellType(cell.CELL_TYPE_STRING)
			cell.setCellValue(name)
		}

		FileOutputStream fos = new FileOutputStream("./Data Files/processes.xlsx")
		workbook.write(fos)
		fos.close()
	}
}
