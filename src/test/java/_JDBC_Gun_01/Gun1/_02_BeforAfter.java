package _JDBC_Gun_01.Gun1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforAfter {

    private Statement statement;
    private Connection connection;

    @BeforeTest
    private void beforTest() throws SQLException {


        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";

         connection= DriverManager.getConnection(url,user,password);

     statement=connection.createStatement();


    }
@AfterTest
private void afterTest() throws SQLException {
    connection.close();

}

    @Test
    public  void Test1() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String name=rs.getString("name");
        System.out.println("name1 = " + name);
        rs.next();
        name=rs.getString("name");
        System.out.println("name2 = " + name);
        rs.next();
        name=rs.getString("name");
        System.out.println("name3 = " + name);
    }

    @Test
    public  void Test2() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String name=rs.getString(2);
        System.out.println("test2 name1 = " + name);
        rs.next();
        name=rs.getString(2);
        System.out.println("test2 name2 = " + name);
        rs.next();
        name=rs.getString(2);
        System.out.println("test2 name3 = " + name);
    }



}
