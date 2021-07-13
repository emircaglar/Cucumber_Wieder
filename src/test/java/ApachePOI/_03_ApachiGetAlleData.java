package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachiGetAlleData {

    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet1=workbook.getSheet("Sheet1");

        int rowCount=sheet1.getPhysicalNumberOfRows();


        for (int i = 0; i < rowCount ; i++) {
            Row row=sheet1.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();


            for (int j = 0; j <cellCount; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell);
            }
            System.out.println();
        }
    }}
