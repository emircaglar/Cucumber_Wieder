package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _88_NewExcel_Seite_an_Seite{
    public static void main(String[] args) throws IOException {
        // Hafizada bir excel Workbook olusturma  degisken tipi// sonra sheet// sonra row
        XSSFWorkbook workbook1 = new XSSFWorkbook();
        XSSFSheet sheet = workbook1.createSheet("Sheet2");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("z");
        int first =0;
        int count = 0;
        System.out.println("for disi");
        row = sheet.createRow(1);
        cell=row.createCell(1);
        cell.setCellValue("zzzzz");
        for (int a = 1; a <= 100; a++) {
            System.out.println("for ici");
            first=a-(10*count);

            for (int k = 1; k <= 10; k++) {
                row = sheet.createRow(k);
                cell = row.createCell(a);
                System.out.println("cell = " + cell);
                cell.setCellValue(first);
                cell = row.createCell(a+1);
                cell.setCellValue("*");
                cell = row.createCell(a+2);
                cell.setCellValue(k);
                System.out.println("cell = " + cell);
                cell = row.createCell(a+3);
                cell.setCellValue("=");
                cell = row.createCell(a+4);
                cell.setCellValue((k * first));
                a++;


            }
            count ++;
        }
        FileOutputStream outputStreamTable = new FileOutputStream("src/test/java/ApachePOI/Resources/yeniSeite.xlsx");
        workbook1.write(outputStreamTable);
        workbook1.close();
        outputStreamTable.close();

    }
}
