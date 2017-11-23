package com.org.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DoctorDatabase {

	public Boolean doctorAvalaible = false;

	public static void main(String[] args) {
		
		//AdminDatabase obj = new AdminDatabase("amitkm","amitkm");
		//System.out.println(obj.loginStatus);
	}
	public DoctorDatabase(String name)
	{
		try{
			final String SQLQuery="select * from Doctor where DoctorName='"+name +"'";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection Con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
			Statement st= Con.createStatement();
			ResultSet rs =  st.executeQuery(SQLQuery);
			if(rs.next())
			{
				doctorAvalaible=true;
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
