package com.domain;

public class Parcel implements java.io.Serializable{
	private Integer parcel_id;
	private String sender;
	private String receiver;
	private String addressTo;
	private String addressFrom;
	private String detail;
	
	public Parcel() {
		
	}

	public Parcel(Integer parcel_id) {
		super();
		this.parcel_id = parcel_id;
	}

	public Parcel(Integer parcel_id, String sender, String receiver, String addressTo, String addressFrom,
			String detail) {
		super();
		this.parcel_id = parcel_id;
		this.sender = sender;
		this.receiver = receiver;
		this.addressTo = addressTo;
		this.addressFrom = addressFrom;
		this.detail = detail;
	}

	public Integer getParcel_id() {
		return parcel_id;
	}

	public void setParcel_id(Integer parcel_id) {
		this.parcel_id = parcel_id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getAddressTo() {
		return addressTo;
	}

	public void setAddressTo(String addressTo) {
		this.addressTo = addressTo;
	}

	public String getAddressFrom() {
		return addressFrom;
	}

	public void setAddressFrom(String addressFrom) {
		this.addressFrom = addressFrom;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
