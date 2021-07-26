package _JDBC_Gun_01.Gun1;

import _JDBC_Gun_01.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Example extends JDBC_Parent {
    @Test
    public  void Test1() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from city");

        rs.relative(5);
        String cityName=rs.getString(2);
        System.out.println("cityName1 = " + cityName);

        rs.relative(5);
         cityName=rs.getString(2);
        System.out.println("cityName2 = " + cityName);

    }

    @Test
    public  void Test2_Last_First_Key_Word() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from city");

        rs.last();
        String cityName=rs.getString(2);
        int cityID= rs.getInt("country_id");
        System.out.println("cityName1 = " + cityName);
        System.out.println("cityID = " + cityID);

        rs.first();
        cityName=rs.getString(2);
        cityID= rs.getInt("country_id");
        System.out.println("cityName1 = " + cityName);
        System.out.println("cityID = " + cityID);

    }

}
