package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx

 */
public class _05_ApachiGetSpecificAllData {
    public static void main(String[] args) {
        System.out.println("aranacak keleime");
        Scanner oku = new Scanner(System.in);
        String arananKelime = oku.nextLine();
        String donenSonuc = gbul(arananKelime);
        System.out.println("donenSonuc = " + donenSonuc);
    }

    public static String gbul(String arananKelime) {
        String path = "src/test/java/ApachePOI/Resources/LoginData(1).xlsx";
        String donecek = "";
        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);

        } catch (Exception e) {
        }
        Sheet sheet1 = workbook.getSheetAt(0);
        int rowCount = sheet1.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet1.getRow(i);

            if (row.getCell(0).toString().equalsIgnoreCase(arananKelime)) {

                int cellCount = row.getPhysicalNumberOfCells();

                for (int j = 1; j < cellCount; j++) {
                    donecek += row.getCell(j);
                }
            }
        }
        return donecek;
    }


}
