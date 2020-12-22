package Kisaan.Kisaan_Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.info.dbConfig.DbConfig;
import com.info.dbConfig.DbUtil;

public class DbConnection {

	public static void main(String[] args) throws SQLException {
		
		
		  Connection com=DbUtil.getConnection(); if(com!=null) {
		  System.out.println("connection create successfully"); }
		 
		
/*		  System.out.println(db.getDriverName()); try {
		  Class.forName("com.mysql.cj.jdbc.Driver"); com=DriverManager.getConnection(
		  "jdbc:mysql://166.62.28.137:3306/kisaanApplication","kisaanApp",
		  "kisaanApp@2020"); Statement stmt=com.createStatement(); ResultSet
		  rs=stmt.executeQuery("select * from login"); while(rs.next())
		  System.out.println(rs.getString(1)); System.out.println("connect");
		  }catch(Exception e) { System.out.println("error"+e); }finally { com.close();
		  System.out.println("connection close"); }*/
		 

	}

}

