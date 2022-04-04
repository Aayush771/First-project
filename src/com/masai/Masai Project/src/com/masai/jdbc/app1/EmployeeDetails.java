package com.masai.jdbc.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDetails {
	public static void main(String[] args) {
	
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String url="jdbc:mysql://localhost:3306/db1";
    try(Connection conn=DriverManager.getConnection(url,"root","sony@11")) {
	
    PreparedStatement ps= conn.prepareStatement("select * from employee where salary < 50000");
      
       ResultSet rs=ps.executeQuery();
       while(rs.next()) {
    	   System.out.println("Employ name is: "+rs.getString("name"));
    	   System.out.println("Employ Address is: "+rs.getString("address"));
    	   System.out.println("Employ Salary is: "+rs.getInt("salary"));
    	   System.out.println("===================================================");
       }
      

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
