package com.capgemini.paymentwallet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/PaymentWalletApp_152693","root","Capgemini@123");
	return conn;
		
	}
}


