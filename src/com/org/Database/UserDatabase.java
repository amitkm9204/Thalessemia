package com.org.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDatabase {

	public static Boolean loginStatus=false;
	public static void main(String[] args) {
		UserDatabase obj=new UserDatabase("amitkm","amitkm");
		//.out.println(loginStatus);
	}
	public UserDatabase(String userName,String Password)
	{
		try{
			final String SQLQuery="select * from UserSignUp where Name='"+userName +"'and Password='"+Password+"'";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
			Statement st= Con.createStatement();
			ResultSet rs =  st.executeQuery(SQLQuery);
			if(rs.next())
			{
			  loginStatus = true;
			  //System.out.println("login success");
			}
				
			
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public UserDatabase()
	{
		
	}
}
