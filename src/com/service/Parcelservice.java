package com.service;

import com.domain.Parcel;
import com.util.response.Code;
import java.util.ArrayList;
import java.util.List;

import com.dao.Parceldao;

public class Parcelservice {

	private Parceldao parcelDao;
	public Parcelservice() {
		parcelDao = new Parceldao();
	}
	
	public int createParcel(Parcel parcel){
		boolean status = parcelDao.createParcel(parcel);
		if(!status){
			return Code.SYSTEM_ERROR;
		}else{
			return Code.SUCCEED;
		}
	}
	
	public Parcel getParcelById(Long id) {
		Parcel parcel = parcelDao.getParcelById(id);
		return parcel;
	}
	
	public List<Parcel> getParcelByUseremail(String useremail) {
		List<Object> parcelsObj=parcelDao.getParcelByUseremail(useremail);
		List<Parcel> parcels=new ArrayList<Parcel>();
		for(Object o:parcelsObj){
			parcels.add((Parcel)o);
		}
		return parcels;
	}
	
	public List<Parcel> getAllParcel(String receivephone){
		List<Object> parcelObj=parcelDao.getAllParcel(receivephone);
		List<Parcel> parcel=new ArrayList<Parcel>();
		for(Object o:parcelObj){
			parcel.add((Parcel)o);
		}
		return parcel;
	}
	
	public List<Parcel> getParcelsByStatus(Integer status){
		List<Object> parcelObj=parcelDao.getParcelsByStatus(status);
		List<Parcel> parcels=new ArrayList<Parcel>();
		for(Object o:parcelObj){
			parcels.add((Parcel)o);
		}
		return parcels;
	}
	
	public boolean acceptParcel(Long parcelId) {
		return parcelDao.acceptParcel(parcelId);
	}
}
