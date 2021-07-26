package _JDBC_Gun_01.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _1_Intro {
    @Test
    public  void Test1() throws SQLException {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";

     Connection connection=DriverManager.getConnection(url,user,password);

     Statement statement=connection.createStatement();

     ResultSet rs=statement.executeQuery("select * from actor");

     rs.next();

     String firstName=rs.getString("first_name");
     String lastName=rs.getString(3);
        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);


        rs.next();

        String firstName1=rs.getString("first_name");
        String lastName1=rs.getString("last_name");
        System.out.println("lastName1 = " + lastName1);
        System.out.println("firstName1 = " + firstName1);

        connection.close();

    }
}
