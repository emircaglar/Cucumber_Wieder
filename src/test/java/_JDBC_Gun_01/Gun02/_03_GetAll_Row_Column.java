package _JDBC_Gun_01.Gun02;

import _JDBC_Gun_01.JDBC_Parent;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAll_Row_Column extends JDBC_Parent {

  @Test
    public void test1() throws SQLException {
      ResultSet rs=statement.executeQuery("select * from language");
      ResultSetMetaData rsmd=rs.getMetaData();

      int colomnCount=rsmd.getColumnCount();
      System.out.println("colomnCount = " + colomnCount);

      for (int i = 1; i <=colomnCount ; i++) {

          String columnName=rsmd.getColumnName(i);
          String columnType=rsmd.getColumnTypeName(i);

          System.out.println("columnType = " + columnType);
          System.out.println("columnName = " + columnName);
      }

    }
    @Test
    public void testhepsi2D_Array() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");
        ResultSetMetaData rsmd=rs.getMetaData();

        int colomnCount=rsmd.getColumnCount();
        rs.last();
        int rowCount=rs.getRow();

        for (int i = 1; i <=colomnCount ; i++) {
            String columnName=rsmd.getColumnName(i);
            System.out.printf("%-25s",columnName+"");
            //System.out.print(rsmd.getColumnName(i));
        }
        System.out.println();
        for (int i = 1; i <=rowCount ; i++) {
            rs.absolute(i);
            for (int j = 1; j <=colomnCount ; j++) {
                String columnName=rs.getString(j);
                System.out.printf("%-25s",columnName+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void testhepsi2D_Array_metod() throws SQLException {
        // film tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.

         getTable("select * from language");
    }

    public void getTable(String str) throws SQLException {
        ResultSet rs=statement.executeQuery(str);
        ResultSetMetaData rsmd=rs.getMetaData();

        int colomnCount=rsmd.getColumnCount();
        rs.last();
        int rowCount=rs.getRow();

        for (int i = 1; i <=colomnCount ; i++) {
            String columnName=rsmd.getColumnName(i);
            System.out.printf("%-25s",columnName+"");
            //System.out.print(rsmd.getColumnName(i));
        }
        System.out.println();
        for (int i = 1; i <=rowCount ; i++) {
            rs.absolute(i);
            for (int j = 1; j <=colomnCount ; j++) {
                String columnName=rs.getString(j);
                System.out.printf("%-25s",columnName+" ");
            }
            System.out.println();
        }
    }

}
