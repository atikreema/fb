package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
	
	Sheet sh;
	
	public ExcelReader(String filename,String sheetname) throws IOException {
		FileInputStream fis= new FileInputStream(filename);
		Workbook wb= new HSSFWorkbook(fis);
	     sh=wb.getSheet(sheetname);
		
		}
	public Object[][] excelToArray(){
		Object[][ ]x;
		int tRows =sh.getPhysicalNumberOfRows();
		int tCells=sh.getRow(0).getPhysicalNumberOfCells();
		x= new Object[tRows-1][tCells];
		//excel row
		for(int row=1;row<tRows;row=row+1 ) {
			for(int col=0;col<tCells;col=col+1) {
				
				//strong into array=reading from excel
				x[row-1][col]=getCellData(row,col);
				
				}
		       }
	return x;
	}
		public String getCellData(int row , int col){
			String value;
			
			Cell c =sh.getRow(row).getCell(col);
			if(c.getCellType()==Cell.CELL_TYPE_STRING) {
				value=c.getStringCellValue();
			}
			else {
				if(c.getNumericCellValue()%1==0) {
					 value=""+(int)c.getNumericCellValue();
				}
				else {
					value=""+c.getNumericCellValue();
				}
					
				}

			return value;
			
			}

            }
