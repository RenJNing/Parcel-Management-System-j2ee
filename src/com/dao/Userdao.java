package com.dao;

import com.domain.User;
import com.util.HibernateUtils;

public class Userdao {	
	private HibernateUtils hibernateUtils;
	public Userdao() {
		this.hibernateUtils = new HibernateUtils();
	}
	public boolean createUser(User user) {
		return hibernateUtils.save(user);
	}
	public boolean isExistEmail(String email) {
		String hql="from User u where u.email=?0";
		return (User) hibernateUtils.findByHql(hql,new Object[]{email})==null?false:true;
	}
	public User getUserByEmailAndPassword(String email, String password) {
		String hql="from User u where u.email=?0 and u.password=?1";
		return (User) hibernateUtils.findByHql(hql,new Object[]{email,password});
	}
	public boolean updateUser(User user) {
		return hibernateUtils.update(user);
	}
}
