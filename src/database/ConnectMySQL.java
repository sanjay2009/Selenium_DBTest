package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;



public class ConnectMySQL {

					
		@Test
		public void testDB() throws Exception, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/selenium","root","Hitha@2009");
			System.out.println("Connected to mysql");
			
			Statement stm= con.createStatement();
			ResultSet rs= stm.executeQuery("select * from seleniumuser");
			
			while (rs.next())
			{
			String fn=	rs.getString("first_name");
			String ln= rs.getString("last_name");
			String el= rs.getString("email");
			System.out.println(fn+ " " +ln+ " " +el);
			
			}
			
		}

	}


