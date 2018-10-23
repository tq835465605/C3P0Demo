package com.foxhis.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class AppMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Connection connection = C3p0Utils.getConnection();
		System.out.println(connection);
		
		try {
			PreparedStatement pStatement=connection.prepareStatement("select * from username");
			ResultSet rSet=pStatement.executeQuery();
		    while(rSet.next())
		    {
		    	String name = rSet.getString("username");
		    	System.out.println(name);
		    }
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			//C3p0Utils.close(connection);
		}
		
		
		Connection connection2 = C3p0Utils.getConnection();
		System.out.println(connection2);
		
		try {
			PreparedStatement pStatement=connection2.prepareStatement("select * from username");
			ResultSet rSet=pStatement.executeQuery();
		    while(rSet.next())
		    {
		    	String name = rSet.getString("username");
		    	System.out.println(name);
		    }
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			//C3p0Utils.close(connection2);
		}
	
		Connection connection3 = C3p0Utils.getConnection();
		System.out.println(connection3);
		
		try {
			PreparedStatement pStatement=connection3.prepareStatement("select * from username");
			ResultSet rSet=pStatement.executeQuery();
		    while(rSet.next())
		    {
		    	String name = rSet.getString("username");
		    	System.out.println(name);
		    }
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			//C3p0Utils.close(connection3);
		}


	}

}
