package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="Srinath@123";
//        PostgreSQL by default taking string in lowercase, so it is better to take the database name and column name in lower case.
        String sql="select sname, marks from student where sid=1";

//        this is Optional
        Class.forName("org.postgresql.Driver");

        Connection cn=
                DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");

        Statement st=cn.createStatement();

        ResultSet re=st.executeQuery(sql);
//        re.next() check in table if it is having next row then it will return true else false
//        initialy pointer next() pointing to the header so first move the next row then print.
        System.out.println(re.next());
        System.out.println(re.next());




        re.close();
        st.close();
        cn.close();
        System.out.println("Connection closed successfully");
    }
}