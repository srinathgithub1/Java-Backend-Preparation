package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/college";
        String username="root";
        String password="Srinath@123";

        Connection con=
                DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");

        Statement st=con.createStatement();

        String sql="select * from student";

        ResultSet rs=st.executeQuery(sql);

        while (rs.next()){
            System.out.print(rs.getInt("rollno") + " - ");
            System.out.print(rs.getString("name") + " - ");
            System.out.println(rs.getInt("age"));
        }

        st.close();
        rs.close();
        con.close();

        System.out.println("Connection closed successfully");

    }
}