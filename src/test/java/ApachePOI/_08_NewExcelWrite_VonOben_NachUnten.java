package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite_VonOben_NachUnten {
    public static void main(String[] args) throws IOException {
        // Hafizada bir excel Workbook olusturma  degisken tipi// sonra sheet// sonra row
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet sheet = xssfWorkbook.createSheet("Sheet1");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("merhaba dunya");
        int first = 0;
        int count = 0;
        for (int a = 1; a <= 100; a++) {

            first=a-(10*count);
            for (int k = 1; k <= 10; k++) {
                row = sheet.createRow(a++);
                cell = row.createCell(0);
                cell.setCellValue(first);
                cell = row.createCell(1);
                cell.setCellValue("*");
                cell = row.createCell(2);
                cell.setCellValue(k);
                cell = row.createCell(3);
                cell.setCellValue("=");
                cell = row.createCell(4);
                cell.setCellValue((k * first));



            }
            count ++;
        }
        FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachePOI/Resources/yeni2 ex.xlsx");
        xssfWorkbook.write(outputStream);
        xssfWorkbook.close();
        outputStream.close();

    }


}
