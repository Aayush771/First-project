package com.masai.jdbc.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProvideBonus {
	

	public static void main(String[] args) {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    String url="jdbc:mysql://localhost:3306/db1";
		    try(Connection conn=DriverManager.getConnection(url,"root","sony@11")) {
			
		    PreparedStatement ps= conn.prepareStatement("update employee set salary =salary+500");
		   
		      
		       int x=ps.executeUpdate();
		       if(x>0) {
		    	   System.out.println("Bonus Updated...");
		       }
		       else 
		    	   System.out.println("Not Updated...");
		       

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
