package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class _07_WrittenInExcel {
    public static void main(String[] args) throws IOException {


        String path="src/test/java/ApachePOI/Resources/WriteInTheExcelFile(1).xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet1=workbook.getSheet("Sheet1");

        Row row=sheet1.createRow(0);// satir olustu ama kullanilabilir degil
        // su ana kadar hafizada satir olusturdu
        Cell cell=row.createCell(0);// hucre olustu ama hazi degil

        cell.setCellValue("merhaba dunya");// billgi yazildi

        for (int i = 1; i <10 ; i++) {
            cell= row.createCell(i);
            cell.setCellValue(i);
        }



      // yazabilmek icin okuma modunu kapatmaliyiz

        inputStream.close();

        //Yazma islemi icin excel yazma modunu acip  yazmaya baslayacaz


        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();




    }


}
