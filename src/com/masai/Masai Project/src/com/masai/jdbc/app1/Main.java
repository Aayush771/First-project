package com.masai.jdbc.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Employ id");
		int id=sc.nextInt();
		// TODO Auto-generated method stub
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String url="jdbc:mysql://localhost:3306/db1";
    try(Connection conn=DriverManager.getConnection(url,"root","sony@11")) {
	
    PreparedStatement ps= conn.prepareStatement("select salary from employee where eid=?");
    ps.setInt(1,id);
      
       ResultSet rs=ps.executeQuery();
       if(rs.next()) {
    	  
    	   System.out.println("Employ Salary is: "+rs.getInt("salary"));
       }
       else
    	   System.out.println("Record does not exist");

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	

}
