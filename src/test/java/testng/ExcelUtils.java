package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtils {

	@DataProvider
	public Object[][] getData() throws IOException {

		File filePath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testData.xlsx");

		FileInputStream stream = new FileInputStream(filePath);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("test01");

		int lastRowNum = sheet.getLastRowNum();

		int lastCellNum = sheet.getRow(0).getLastCellNum();

		Object[][] dataTable = null;

		dataTable = new String[lastRowNum][lastCellNum];

		for (int i = 1; i < lastRowNum; i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < lastCellNum; j++) {

				Cell cell = row.getCell(j);

				if (cell != null) {
					System.out.println(cell.toString());
					dataTable[i][j] = cell.toString();
					
				}

			}
		}

		return dataTable;

	}
	
	public static void main(String[] args) throws IOException {
		ExcelUtils obj = new ExcelUtils();
		obj.getData();
	}

}
