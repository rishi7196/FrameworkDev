package Data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public String GetExcelData(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		String returnvalue = null;

		// read the data from
		FileInputStream fis = new FileInputStream(".\\excel\\data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		// read data login sheet
		Sheet s = wb.getSheet("Login");
		Row row = s.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		returnvalue = cell.getStringCellValue();
		return returnvalue;

	}

}
