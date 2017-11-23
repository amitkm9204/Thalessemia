package com.org.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BloodDatabase {

	public static Boolean bloodAvailable = false;

	public static void main(String[] args) {
		
		//AdminDatabase obj = new AdminDatabase("amitkm","amitkm");
		//System.out.println(obj.loginStatus);
	}
	public  BloodDatabase(String bloodGroup,String bloodType,int amount)
	{
		try{
			final String SQLQuery="select * from BloodDetails where BloodGroup='"+bloodGroup +"'and BloodType='"+bloodType+"'and Amount>='"+amount+"'";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
			Statement st= Con.createStatement();
			ResultSet rs =  st.executeQuery(SQLQuery);
			if(rs.next())
			{
				bloodAvailable=true;
				//System.out.println("status successful");
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
}
