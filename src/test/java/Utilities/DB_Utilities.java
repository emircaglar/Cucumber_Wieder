package Utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB_Utilities {
    protected static Statement statement;
    private static Connection connection;


    public static void DBConSet() {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        String user = "technostudy";
        String password = "zhTPis0l9#$&";
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void DBConClose() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static List<List<String>> getListData(String query) {
        DBConSet();
        List<List<String>> returnlist = new ArrayList<>();
        try {
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            int colomnCount = rsmd.getColumnCount();

            while (rs.next()) {
                List<String> rowlist = new ArrayList<>();
                for (int j = 1; j <= colomnCount; j++) {
                    rowlist.add(rs.getString(j));

                }
                returnlist.add(rowlist);
            }
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        DBConClose();
        return returnlist;
    }

    public static void main(String[] args) {
        // System.out.println("sonuc" + getListData("select * from language"));
        List<List<String>> data = getListData("select * from language");
        for (List<String> a : data
        ) {
            System.out.println("a = " + a);
        }

    }

}
