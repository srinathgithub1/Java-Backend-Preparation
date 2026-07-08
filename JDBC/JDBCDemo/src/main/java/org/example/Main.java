package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/Demo";
        String username="postgres";
        String password="Srinath@123";
//        PostgreSQL by default taking string in lowercase, so it is better to take the database name and column name in lower case.
        String sql="select * from student where sid=?";
        String sql2="select * from student";

//        this is Optional
        Class.forName("org.postgresql.Driver");

        Connection con=
                DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");

        PreparedStatement st=con.prepareStatement(sql);

        st.setInt(1,1);

        ResultSet rs=st.executeQuery();
        System.out.println("=================Displaying Single Record.====================");
        while(rs.next()){
            System.out.println("Student ID: "+rs.getString("sid"));
            System.out.println("Student Name: "+rs.getString("sname"));
            System.out.println("Student Marks: "+rs.getString("marks"));
        }

        /**
         * Displaying all record.
         */
        System.out.println("=================Displaying All Record.====================");
        PreparedStatement st2=con.prepareStatement(sql2);
        ResultSet rs1=st2.executeQuery();
        while(rs1.next()){
            System.out.println("Student ID: "+rs1.getString("sid"));
            System.out.println("Student Name: "+rs1.getString("sname"));
            System.out.println("Student Marks: "+rs1.getString("marks"));
            System.out.println("====================================================");
        }

        st.close();
        st2.close();
        con.close();
        System.out.println("Connection closed successfully");
    }
}