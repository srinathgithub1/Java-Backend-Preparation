package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="Srinath@123";
//        PostgreSQL by default taking string in lowercase, so it is better to take the database name and column name in lower case.
        String sql="select * from student";

//        this is Optional
        Class.forName("org.postgresql.Driver");

        Connection cn=
                DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");

        Statement st=cn.createStatement();

        ResultSet rs=st.executeQuery(sql);
//        re.next() check in table if it is having next row then it will return true else false
//        initialy pointer next() pointing to the header so first move the next row then print.
//        while(rs.next()){
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }
//        OR
        while(rs.next()){
            System.out.print(rs.getInt("sid") + " - ");
            System.out.print(rs.getString("sname") + " - ");
            System.out.println(rs.getInt("marks") + " - ");
        }

        rs.close();
        st.close();
        cn.close();
        System.out.println("Connection closed successfully");
    }
}