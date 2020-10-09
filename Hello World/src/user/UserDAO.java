package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class UserDAO {
	//DAO(Data Access Object)
	//실질적으로 데이터베이스와 연동되어 데이터베이스를 조작하는 역할을 한다
	public int join(String userID, String userPassword) {
		String SQL="INSERT INTO USER VALUES(?,?)";
		try {
			Connection conn=DatabaseUtil.getConnection();
			PreparedStatement pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2, userPassword);
			return pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
