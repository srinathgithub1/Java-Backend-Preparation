package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="Srinath@123";
//        PostgreSQL by default taking string in lowercase, so it is better to take the database name and column name in lower case.
        String sql="insert into student values(?,?,?)";

//        this is Optional
        Class.forName("org.postgresql.Driver");

        Connection con=
                DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");

        PreparedStatement st=con.prepareStatement(sql);

        st.setInt(1,8);
        st.setString(2,"Sonu");
        st.setInt(3,68);

        int rows=st.executeUpdate();
        System.out.println(rows + " rows inserted");

        st.close();
        con.close();
        System.out.println("Connection closed successfully");
    }
}