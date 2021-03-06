package com.dao;

import java.util.List;

import com.domain.Parcel;
import com.util.HibernateUtils;

public class Parceldao {

	private HibernateUtils hibernateUtils;
	public Parceldao() {
		this.hibernateUtils = new HibernateUtils();
	}
	
	public boolean createParcel(Parcel parcel) {
		return hibernateUtils.save(parcel);
	}
	
	public List<Object> getAllParcel(String receivephone){
		String hql="from Parcel as p where p.receivephone=?0 order by parcel_id desc";
		return hibernateUtils.findByHqlAll(hql, new Object[] {receivephone});
	}
	
	public boolean updateParcel(Parcel parcel) {
		return hibernateUtils.update(parcel);
	}
	
	public Parcel getParcelById(Long id) {
		return (Parcel) hibernateUtils.findByHql("from Parcel p where p.id=?0", new Object[] { id });
	}
	
	public  List<Object> getParcelByUseremail(String useremail) {
		return  hibernateUtils.findByHqlAll("from Parcel p where p.useremail=?0", new Object[] { useremail });
	}	
	
	public List<Object> getParcelsByStatus(Integer status) {
		return hibernateUtils.findByHqlAll("from Parcel p where p.status=?0", new Object[] { status });
	}
	
	public boolean acceptParcel(Long parcelId) {
		Parcel p = (Parcel) hibernateUtils.findByHql("from Parcel p where p.id=?0", new Object[] { parcelId });
		p.setStatus(1);
		return hibernateUtils.update(p);
	}
}
