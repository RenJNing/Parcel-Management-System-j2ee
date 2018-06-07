package com.util.response;

public interface Code {	
	// 成功
	int SUCCEED = 200;
	// 错误的邮箱或者密码
	int WRONG_EMAIL_OR_PASSWORD = 300;
	
	// 邮箱被占用
	int OCCUPIED_EMAIL = 303;
	
	// 未知错误
	int UNKNOWN_FAULT = 500;
	
	int WRONG_PASSWORD =301;
	
	// 系统错误
	int SYSTEM_ERROR = -1;
	
	int NO_PARCEL = 302;
}
