package learning.FrameworkConcepts.POIFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class HSSFDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("./excel-files/ExcelXLS.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);
		HSSFRow row = sheet.getRow(2);
		HSSFCell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		workbook.close();
	}

}
