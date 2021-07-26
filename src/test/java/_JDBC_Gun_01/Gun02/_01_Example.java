package _JDBC_Gun_01.Gun02;

import _JDBC_Gun_01.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_Example extends JDBC_Parent {


    @Test
            private void test2_LAStFrstKey() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from address");

        rs.absolute(10);
        String disctrictName= rs.getString("district");
        System.out.println("disctrictName = " + disctrictName);

        rs.relative(12);
         disctrictName= rs.getString("district");
        System.out.println("disctrictName = " + disctrictName);

        rs.last();
        disctrictName= rs.getString("district");
        System.out.println("disctrictName = " + disctrictName);

    }
    @Test
    private void test1while() throws SQLException{
        ResultSet rs=statement.executeQuery("select * from customer");

        int rowcount=0;
        while (rs.next()){
            String ad=rs.getString("first_name");
            String soyad=rs.getString("last_name");
            System.out.println("ad soyad = " + ad + soyad);
            rowcount++;
        }
        System.out.println("rowcount = " + rowcount);

        System.out.println("rs.getRow() = " + rs.getRow());// bu nokta while durduu yani satirin olmadigi yeri yazdirdi.

        rs.last();
        System.out.println("rs.getRow() = " + rs.getRow());
    }

    @Test
    private void test2for() throws SQLException{
        ResultSet rs=statement.executeQuery("select * from customer");
        rs.last();
        System.out.println("rs.getRow() = " + rs.getRow());
        int rowcount=rs.getRow();

        rs.first();
        for (int i=1;i<rowcount;i++){
            String ad=rs.getString("first_name");
            String soyad=rs.getString("last_name");
            System.out.println("ad soyad = " + ad + soyad);
           rs.next();
        }

    }

    @Test
    private void test2for_for() throws SQLException{
        ResultSet rs=statement.executeQuery("select * from customer");
        rs.last();
        System.out.println("rs.getRow() = " + rs.getRow());
        int rowcount=rs.getRow();

        for (int i=1;i<rowcount;i++){
            rs.absolute(i);
            String ad=rs.getString("first_name");
            String soyad=rs.getString("last_name");
            System.out.println("ad soyad = " + ad + soyad);

        }

    }


    @Test
    private void test2for_for_ters() throws SQLException{
        ResultSet rs=statement.executeQuery("select * from customer");
        rs.last();
        System.out.println("rs.getRow() = " + rs.getRow());
        int rowcount=rs.getRow();

        for (int i=rowcount;i>0;i--){
            rs.absolute(i);
            String ad=rs.getString("first_name");
            String soyad=rs.getString("last_name");
            System.out.println("ad soyad = " + ad + soyad);

        }

    }
}
