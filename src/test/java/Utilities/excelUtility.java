package Utilities;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class excelUtility {

    public static List<List<String>> getListData(String path,String sheetName,int columbnum){
        List<List<String>> returnlist=new ArrayList<>();

        Workbook workbook=null;
        try {
            FileInputStream inputStream=new FileInputStream(path);
            workbook= WorkbookFactory.create(inputStream);

        }catch (Exception e){}


        Sheet sheet1=workbook.getSheet(sheetName);

        int rowCount=sheet1.getPhysicalNumberOfRows();


        for (int i = 0; i < rowCount ; i++) {
            List<String>rowlist=new ArrayList<>();
            Row row=sheet1.getRow(i);
            for (int j = 0; j <columbnum ; j++) {
               rowlist.add(row.getCell(j).toString());
            }
            returnlist.add(rowlist);
        }
      return   returnlist;
    }






    public static void writeExcel(String path,Scenario scenario,String browserName,String time)  {


        File f=new File(path);
        String sheetName="sayfa1";


if(!f.exists()) {
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet(sheetName);


    Row row = sheet.createRow(0);// satir olustu ama kullanilabilir degil
    // su ana kadar hafizada satir olusturdu
    Cell cell = row.createCell(0);// hucre olustu ama hazi degil

    cell.setCellValue(scenario.getId());// billgi yazildi
    cell = row.createCell(2);
    cell.setCellValue(time);
    cell = row.createCell(1);
    cell.setCellValue(browserName);

    FileOutputStream outputStream = null;
    try { outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
       outputStream.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
else
{
    // dosya var ise
    // en son satır sayısını bulup bir fazlasını verip row oluşturup oraya yazıcam

    FileInputStream inputStream = null;
    Workbook workbook = null;
    try {
        inputStream = new FileInputStream(path);
        workbook = WorkbookFactory.create(inputStream);
    } catch (IOException e) {
        e.printStackTrace();
    }

    Sheet sheet = workbook.getSheet(sheetName);

    // calisma sayfasındaki toplam satır sayısını veriyor.
    int rowCount = sheet.getPhysicalNumberOfRows();

    Row row = sheet.createRow(rowCount);// satır oluştur

    Cell cell = row.createCell(0);
    cell.setCellValue(scenario.getId());

    cell = row.createCell(1);
    cell.setCellValue(scenario.getStatus());

    cell = row.createCell(2);
    cell.setCellValue(browserName);

    cell = row.createCell(3);
    cell.setCellValue(time);

    // dosyayı oluşturduk.
    FileOutputStream outputStream = null;
    try {
        inputStream.close();
        outputStream = new FileOutputStream(path);
        workbook.write(outputStream);// içine hafızadaki bilgileri yazdık.
        workbook.close(); // hafızayı boşalttık
        outputStream.close();// dosyayı kapattık.
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    }




    public static void main(String[] args)  {
        List<List<String>>list=getListData("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx","testCitizen",2);

        System.out.println("list = " + list);

    }
}
