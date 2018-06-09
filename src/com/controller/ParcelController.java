package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Parcel;
import com.service.Parcelservice;
import com.util.response.Code;
import com.util.response.ResponseData;

@Controller
public class ParcelController {

	private Parcelservice parcelService;
	public ParcelController() {
		this.parcelService = new Parcelservice();
	}
	
	@ResponseBody
	@RequestMapping("/user/sendparcel")
	public ResponseData createParcel(@RequestBody Parcel parcel){
		parcel.setStatus(new Integer(0));
		int status = parcelService.createParcel(parcel);
		return new ResponseData(status);
	}
	
	@ResponseBody
	@RequestMapping(value = "/user/getmyparcel")
	public ResponseData getMyParcel(@RequestBody Map<String, String> map) {
		System.out.print(map.get("useremail"));
		List<Parcel> myParcels = parcelService.getParcelByUseremail(map.get("useremail"));
		if(myParcels==null) {
			return new ResponseData(Code.NO_PARCEL);
		}
		else {
			return new ResponseData(Code.SUCCEED, myParcels);
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/user/trackparcel1")
	public ResponseData getParcel(@RequestBody Map<String, Long> map) {
		System.out.print(map.get("parcel_id"));
		Parcel parcel = parcelService.getParcelById(map.get("parcel_id"));
		if(parcel==null) {
			return new ResponseData(Code.NO_PARCEL);
		}
		else {
			return new ResponseData(Code.SUCCEED, parcel);
		}
	}

	
	@ResponseBody
	@RequestMapping(value = "/user/trackparcel2")
	public ResponseData getParcels(@RequestBody Map<String, String> map) {
		List<Parcel> parcels = parcelService.getAllParcel(map.get("receivephone"));
		if(parcels.isEmpty()) {
			return new ResponseData(Code.NO_PARCEL);
		}
		else {
			return new ResponseData(Code.SUCCEED, parcels);
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/admin/getunacceptedparcel")
	public ResponseData getAcceptedParcels() {
		List<Parcel> unacceptedParcels = parcelService.getParcelsByStatus(new Integer(0));
		if(unacceptedParcels.isEmpty()) {
			return new ResponseData(Code.NO_PARCEL);
		}
		else {
			return new ResponseData(Code.SUCCEED, unacceptedParcels);
		}
	}
	
	@ResponseBody
	@RequestMapping("/admin/acceptparcel")
	public ResponseData acceptParcel(@RequestBody Map<String, Long[]> map){
		System.out.println("=====================================");
		System.out.println(map.get("parcel_ids"));
		int status = Code.SUCCEED;
		for(Long parcelId: map.get("parcel_ids")) {
			if(!parcelService.acceptParcel(parcelId)) {
				status = Code.SYSTEM_ERROR;
			}
		}
		return new ResponseData(status);
	}
}
