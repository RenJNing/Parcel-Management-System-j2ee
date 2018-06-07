package com.service;

import com.dao.Userdao;
import com.domain.User;
import com.util.response.Code;

public class Userservice {
	
	private Userdao userDao;
	public Userservice() {
		this.userDao=new Userdao();
	}
	public User getUser(User user) {
		User u=userDao.getUserByEmailAndPassword(user.getEmail(), user.getPassword());
		return u;
	}
	
	public int register(User user) {
		//检查邮件名和用户名
		boolean isExistEmail=userDao.isExistEmail(user.getEmail());
		if(isExistEmail){
			return Code.OCCUPIED_EMAIL;
		}
		else{
			boolean status=userDao.createUser(user);
			if(!status){
				return Code.SYSTEM_ERROR;
			}else{
				return Code.SUCCEED;
			}
		}
	}
	
	public int login(User user) {
		User u=userDao.getUserByEmailAndPassword(user.getEmail(), user.getPassword());
		
		if(u==null){
			return Code.WRONG_EMAIL_OR_PASSWORD;
		}
		return Code.SUCCEED;
	}

	public int updatePassword(User user, String oldPassword, String newPassword) {
		User u=userDao.getUserByEmailAndPassword(user.getEmail(), oldPassword);
		if(u==null){
			return Code.WRONG_PASSWORD;
		}
		user.setPassword(newPassword);
		return userDao.updateUser(user)==true?Code.SUCCEED:Code.SYSTEM_ERROR;
	}
}
