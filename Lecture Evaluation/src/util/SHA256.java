package util;

import java.security.MessageDigest;

public class SHA256 {
	//이메일 인증 시 필요한 인증번호를 해시값으로 만들기
	public static String getSHA256(String input) {
		StringBuffer result=new StringBuffer();
		try {
			MessageDigest digest=MessageDigest.getInstance("SHA-256");
			byte[] salt="Hello! This is Salt.".getBytes();//단순하게 SHA-256 적용 시 보안에 취약하므로 salt 이용
			digest.reset();
			digest.update(salt);
			byte[] chars=digest.digest(input.getBytes("UTF-8"));
			for(int i=0;i<chars.length;i++) {
				String hex=Integer.toHexString(0xff&chars[i]);
				if(hex.length()==1) result.append("0");
				result.append(hex);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}
