package com.mysite.sbb.user;

import lombok.Getter;


public enum UserRole {

	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER");
	
	UserRole(String value){
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	private String value;
}
