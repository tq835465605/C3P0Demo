package com.foxhis.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class C3p0Utils {
	
	
	//通过标识名来创建相应连接池,c3p0-config.xml里的 <named-config name="mysql">  
	static ComboPooledDataSource dataSource = new ComboPooledDataSource("mysql");

	public static Connection getConnection()
	{
		Connection connection=null;
		try{
			connection = dataSource.getConnection();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return connection;
	}
	
	public static void close(Connection conn) 
	{
		
		try {  
			if(conn!=null && !conn.isClosed()){  

				conn.close();  
			}
		} catch (SQLException e) {  

		}  

    }  

	
}
