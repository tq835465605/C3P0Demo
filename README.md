# C3P0连接池demo

主要注意的是配置文件c3p0-config.xml的配置

新建一个C3p0Utils类来处理数据库连接与释放
 ```java
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
```
