package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

import secret.Account;

public class Gmail extends Authenticator{
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		Account ac=new Account();
		return new PasswordAuthentication(ac.getId(), ac.getPassword());
		//이메일을 전송할 관리자 Gmail 아이디와 비번
	}
}
