package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Parcel implements Serializable{
	private Long parcel_id;
	private String sendername;
	private String receivename;
	private String senderaddress;
	private String receiveaddress;
	private String senderphone;
	private String receivephone;
	private Integer status;
	private String date;
	public Long getParcel_id() {
		return parcel_id;
	}
	public void setParcel_id(Long parcel_id) {
		this.parcel_id = parcel_id;
	}
	public String getSendername() {
		return sendername;
	}
	public void setSendername(String sendername) {
		this.sendername = sendername;
	}
	public String getReceivename() {
		return receivename;
	}
	public void setReceivename(String receivename) {
		this.receivename = receivename;
	}
	public String getSenderaddress() {
		return senderaddress;
	}
	public void setSenderaddress(String senderaddress) {
		this.senderaddress = senderaddress;
	}
	public String getReceiveaddress() {
		return receiveaddress;
	}
	public void setReceiveaddress(String receiveaddress) {
		this.receiveaddress = receiveaddress;
	}
	public String getSenderphone() {
		return senderphone;
	}
	public void setSenderphone(String senderphone) {
		this.senderphone = senderphone;
	}
	public String getReceivephone() {
		return receivephone;
	}
	public void setReceivephone(String receivephone) {
		this.receivephone = receivephone;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {	
		this.date = date.substring(0, 10);
	}
}
