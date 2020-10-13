package evaluation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DatabaseUtil;

public class EvaluationDAO {

	public int write(EvaluationDTO evaluationDTO) {
		String SQL="insert into evaluation values(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DatabaseUtil.getConnection();
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, evaluationDTO.getUserID());
			pstmt.setString(2, evaluationDTO.getLectureName());
			pstmt.setString(3, evaluationDTO.getProfessorName());
			pstmt.setInt(4, evaluationDTO.getLectureYear());
			pstmt.setString(5, evaluationDTO.getSemesterDivide());
			pstmt.setString(6, evaluationDTO.getLectureDivide());
			pstmt.setString(7, evaluationDTO.getEvaluationTitle());
			pstmt.setString(8, evaluationDTO.getEvaluationContent());
			pstmt.setString(9, evaluationDTO.getTotalScore());
			pstmt.setString(10, evaluationDTO.getCreditScore());
			pstmt.setString(11, evaluationDTO.getLectureScore());
			pstmt.setString(12, evaluationDTO.getKindnessScore());
			return pstmt.executeUpdate();//영향을 받은 쿼리 수 반환=1
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn!=null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt!=null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs!=null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return -1;//데이터베이스 오류
	}
	
}
