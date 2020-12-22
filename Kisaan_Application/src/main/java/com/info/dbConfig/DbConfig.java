/*
 * package com.info.dbConfig;
 * 
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.boot.context.properties.ConfigurationProperties; import
 * org.springframework.context.annotation.PropertySource; import
 * org.springframework.stereotype.Component;
 * 
 * @Component()
 * 
 * @PropertySource("classpath:DbCogfig.properties")
 * 
 * @ConfigurationProperties public class DbConfig {
 * 
 * @Value("${driverName}") private String driverName;
 * 
 * @Value("${databaseName}") private String databaseName;
 * 
 * @Value("${userName}") private String userName;
 * 
 * @Value("${password}") private String password;
 * 
 * @Value("${hostName}") private String hostName;
 * 
 * @Value("${portNo}") private String portNo;
 * 
 * @Value("${url}") private String url; public String getDriverName() { return
 * driverName; } public void setDriverName(String driverName) { this.driverName
 * = driverName; } public String getDatabaseName() { return databaseName; }
 * public void setDatabaseName(String databaseName) { this.databaseName =
 * databaseName; } public String getUserName() { return userName; } public void
 * setUserName(String userName) { this.userName = userName; } public String
 * getPassword() { return password; } public void setPassword(String password) {
 * this.password = password; } public String getHostName() { return hostName; }
 * public void setHostName(String hostName) { this.hostName = hostName; } public
 * String getPortNo() { return portNo; } public void setPortNo(String portNo) {
 * this.portNo = portNo; } public String getUrl() { return url; } public void
 * setUrl(String url) { this.url = url; } public String toString() { return
 * "driverName"+driverName+"databaseName"+databaseName+"userName"+userName; }
 * 
 * public static void main(String arge) { DbConfig dbconfig=new DbConfig();
 * System.out.println(dbconfig.getDriverName()); }
 * 
 * }
 */