package com.info.dbConfig;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtil {
	private static final String DB_DRIVER_CLASS = "driverName";
	private static final String DB_USER_NAME = "userName";
	private static final String DB_PASSWORD = "password";
	private static final String DB_NAME = "databaseName";
	private static final String DB_HOST_NAME = "hostName";
	private static final String DB_PORT_NO = "portNo";
	private static final String DB_URL = "url";

	private static Properties properties = null;
	private static Connection connection = null;
	static {
		try {
			/*
			 * properties=new Properties(); properties.load(new
			 * FileInputStream("DbCogfig.properties"));
			 * System.out.println(properties.getProperty(DB_DRIVER_CLASS));
			 * Class.forName(properties.getProperty(DB_DRIVER_CLASS));
			 * System.out.println(properties.getProperty(DB_URL)+properties.getProperty(
			 * DB_HOST_NAME)+properties.getProperty(DB_PORT_NO)+properties.getProperty(
			 * DB_NAME) + "," + properties.getProperty(DB_USER_NAME) + ","
			 * +properties.getProperty(DB_PASSWORD) );
			 * connection=DriverManager.getConnection(properties.getProperty(DB_URL)+
			 * properties.getProperty(DB_HOST_NAME)+properties.getProperty(DB_PORT_NO)+
			 * properties.getProperty(DB_NAME) + "," + properties.getProperty(DB_USER_NAME)
			 * + ","+"" +properties.getProperty(DB_PASSWORD) );
			 */
			 Class.forName("com.mysql.cj.jdbc.Driver"); connection=DriverManager.getConnection(
					  "jdbc:mysql://166.62.28.137:3306/kisaanApplication","kisaanApp",
					  "kisaanApp@2020");
		} catch (Exception e) {
			System.out.println("error" + e);
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
