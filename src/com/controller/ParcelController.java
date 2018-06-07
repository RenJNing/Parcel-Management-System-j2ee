package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		parcelService = new Parcelservice();
	}
	
	@ResponseBody
	@RequestMapping("/user/sendparcel")
	public ResponseData createParcel(@RequestBody Parcel parcel){
		int status = parcelService.createParcel(parcel);
		return new ResponseData(status);
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
}
