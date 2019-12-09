package org.freedom.securitytest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Bc {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		String a="123456";
		a=bCryptPasswordEncoder.encode(a);
		System.out.println(a);

	}

}
