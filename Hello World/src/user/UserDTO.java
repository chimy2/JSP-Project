package user;

public class UserDTO {
	//일반적으로 패키지명을 데이터베이스의 테이블명과 동일하게 명명
	//DTO(Data Transfer Object)
	// JSP 프로그램 안에서 일시적으로 하나의 데이터 단위를 담기 위한 용도의 객체
	//데이터베이스의 컬럼을 그대로 정의하는 것이 일반적
	String userID;
	String userPassword;
	
	//get - 현재 기록된 데이터 가져오기
	//set - 데이터 기록하기
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
