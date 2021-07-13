package ApachePOI;


/* Soru 1:
        *  Çarpım tablosunu excele yazdırınız.
        *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
        *  sıfırdan excel oluşturarak.
        *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata


        /  Soru 2:
        *  Çarpım tablosunu excele yazdırınız.
        *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
        *  sıfırdan excel oluşturarak.
        *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
        */


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _09_Task_Carpim_Tablosu {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

       /* Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Zarttttt");
        */
        for (int i = 1; i < 100; i++) {
            Row row1 = sheet.createRow(i);
            Cell cell1 = row1.getCell(5);
            for (int j = 0; j <5 ; j++) {
                //double first=cell1.setCellValue(i);
                //System.out.println(cell1.setCellValue(i));
            }

        }

        OutputStream outputStream = new FileOutputStream("src/test/java/ApachePOI/Resources/yeni1 ex.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }


}
