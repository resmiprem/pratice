package Day15;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.xssf.usermodel.XSSFRow; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		

        XSSFWorkbook workbook = new XSSFWorkbook(); 
        XSSFSheet spreadsheet 
            = workbook.createSheet(" bill "); 
        XSSFRow row; 
        Map<String, Object[]> consumerbill 
            = new TreeMap<String, Object[]>(); 
  
            consumerbill .put( 
            "1", 
            new Object[] { "S.no", "item","unit", "price","qty","amount" }); 
  
            consumerbill.put("2", new Object[] { "1", "daal","kg", 
                                            "25rs","1kg","25rs" }); 
  
            consumerbill.put( 
            "3", 
            new Object[] { "2", "rice","kg","50rs","2kg","100rs" }); 
  
   
  
        Set<String> keyid = consumerbill.keySet(); 
  
        int rowid = 0; 
        for (String key : keyid) { 
  
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = consumerbill.get(key); 
            int cellid = 0; 
  
            for (Object obj : objectArr) { 
                Cell cell = row.createCell(cellid++); 
                cell.setCellValue((String)obj); 
            } 
        } 
        FileOutputStream out = new FileOutputStream( 
            new File("C:\\Users\\HP\\eclipse-workspace\\ey\\src\\consumerbill.xls")); 
  
        workbook.write(out); 
        out.close(); 
	}

}
