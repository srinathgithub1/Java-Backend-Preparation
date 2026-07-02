package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="Srinath@123";
//        this is Optional
        Class.forName("org.postgresql.Driver");

        Connection cn=
                DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");

        Statement st=cn.createStatement();
        ResultSet re=st.executeQuery("select * from student");
        while(re.next()){
            System.out.println(re.getString("sName"));
        }
        re.close();
        st.close();
        cn.close();
    }
}