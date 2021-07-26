package _JDBC_Gun_01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Parent {
    protected Statement statement;
    private Connection connection;

    @BeforeTest
    public void beforTest()  {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";
        try {
            connection= DriverManager.getConnection(url,user,password);
            statement=connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    @AfterTest
    public void afterTest() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
