package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

	public static Connection getConnection() {
		try {
			final String URL = "jdbc:mysql://localhost:3306/LectureEvaluation?serverTimezone=Asia/Seoul&useSSL=false";
			final String ID = "root";
			final String PASSWORD = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(URL, ID, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
