package com.util.response;

public class ResponseData {

	protected int code;
	protected String msg;
	protected Object obj;

	public ResponseData(int code) {
		super();
		this.code = code;
	}
	public ResponseData(int code, Object obj) {
		super();
		this.code = code;
		this.obj = obj;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}

	
}
