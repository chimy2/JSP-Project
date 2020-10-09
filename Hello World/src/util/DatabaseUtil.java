package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	//데이터 베이스 연동
	public static Connection getConnection() {
		try {
			String dbURL="jdbc:mysql://localhost:3306/TUTORIAL";
			String dbID="root";
			String dbPassword="1234";
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(dbURL,dbID,dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}return null;
	}
}
