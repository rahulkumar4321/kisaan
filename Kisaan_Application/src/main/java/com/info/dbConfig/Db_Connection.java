/*
 * package com.info.dbConfig;
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.Statement;
 * 
 * import org.apache.logging.log4j.LogManager; import
 * org.apache.logging.log4j.Logger;
 * 
 * public class Db_Connection { private Logger
 * logger=LogManager.getLogger(Db_Connection.class); DbConfig dbconfig=new
 * DbConfig(); Connection com=null; public void getConnection() { try {
 * Class.forName(dbconfig.getDriverName());
 * com=DriverManager.getConnection(dbconfig.getUrl()); }catch(Exception e) {
 * logger.error("Error in getConnection"+e); } } }
 */