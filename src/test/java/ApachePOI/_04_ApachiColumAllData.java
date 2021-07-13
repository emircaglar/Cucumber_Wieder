package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.Scanner;

/*
* Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
* yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
* src/test/java/ApachePOI/resources/LoginData.xlsx

*/
public class _04_ApachiColumAllData {

   public static void main(String[] args) {


       System.out.println("aranacak keleime");
       Scanner oku=new Scanner(System.in);
       int sayi =oku.nextInt();
       String donenSonuc=gbul(sayi);
       System.out.println("donenSonuc = " + donenSonuc);

   }

public static String gbul(int sayi){



   String path="src/test/java/ApachePOI/Resources/LoginData(1).xlsx";
   String donecek = "";
   Workbook workbook=null;
   try {
       FileInputStream inputStream=new FileInputStream(path);
       workbook= WorkbookFactory.create(inputStream);

   }catch (Exception e){}


   Sheet sheet1=workbook.getSheetAt(0);

   int rowCount=sheet1.getPhysicalNumberOfRows();


   for (int i = 0; i < rowCount ; i++) {
       Row row = sheet1.getRow(i);


               donecek += row.getCell(sayi)+" ";


   }


    return donecek;
}


}
