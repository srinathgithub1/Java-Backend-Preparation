package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="Srinath@123";
//        PostgreSQL by default taking string in lowercase, so it is better to take the database name and column name in lower case.
        String sql="insert into student values(7,'Kiran',80)";

//        this is Optional
        Class.forName("org.postgresql.Driver");

        Connection cn=
                DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");

        Statement st=cn.createStatement();

//        boolean status=st.execute(sql);
//        System.out.println(status);
        int rows=st.executeUpdate(sql);
        System.out.println(rows+" rows inserted");

        st.close();
        cn.close();
        System.out.println("Connection closed successfully");
    }
}