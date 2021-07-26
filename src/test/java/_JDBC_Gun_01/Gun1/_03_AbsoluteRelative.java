package _JDBC_Gun_01.Gun1;

import _JDBC_Gun_01.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBC_Parent {

    @Test
    public  void Test1() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from film");

        rs.absolute(10);
        String title=rs.getString("title");
        System.out.println("name1 = " + title);
        rs.absolute(-15);
        title=rs.getString("title");
        System.out.println("name2 = " + title);
        rs.relative(5);
        title=rs.getString("title");
        System.out.println("name3 = " + title);
        rs.relative(-5);
        title=rs.getString("title");
        System.out.println("name back = " + title);
        rs.absolute(15);
        title=rs.getString("title");
        System.out.println("name4 = " + title);
    }

}
