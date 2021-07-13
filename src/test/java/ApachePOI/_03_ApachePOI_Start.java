package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOI_Start {

    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream dosyaOkumaIslemcisi=new FileInputStream(path);

        Workbook calismaKitabi=WorkbookFactory.create(dosyaOkumaIslemcisi);

        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");
        
        Row satir= calismaSayfasi.getRow(1);
        Cell hucre=satir.getCell(2);
        System.out.println("hucre = " + hucre);

    }
}
