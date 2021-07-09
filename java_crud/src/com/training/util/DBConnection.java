package com.training.util;

import java.sql.*;

public class DBConnection {
	
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","hr","hr");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args)
	{
		System.out.println(DBConnection.getConnection());
	}

}
