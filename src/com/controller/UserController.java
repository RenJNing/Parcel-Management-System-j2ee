package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.User;
import com.service.Userservice;
import com.util.request.PasswordList;
import com.util.response.Code;
import com.util.response.ResponseData;


@Controller
public class UserController {	
//	@CrossOrigin(origins="*")
	
	private Userservice userService;
	public UserController() {
		this.userService = new Userservice();
	}
	
	@RequestMapping(value="/user/login")
	@ResponseBody
	public ResponseData login(@RequestBody User user, HttpSession session) {
		
		int status=userService.login(user);
		if(status==Code.SUCCEED) {
			session.setAttribute("user",userService.getUser(user));
		}
        return new ResponseData(status); 
	}
	
	@RequestMapping(value="/user/register")
	@ResponseBody
	public ResponseData register(@RequestBody User user, HttpSession session) {
		int status = userService.register(user);
		return new ResponseData(status);		
	}
	
	@ResponseBody
	@RequestMapping("/user/modifypassword")
	public ResponseData changePassword(@RequestBody PasswordList pwdUtil, HttpSession session) {
		System.out.println("=====================");
		System.out.println(pwdUtil.getNewpassword());
		User u = (User) session.getAttribute("user");
		int status = userService.updatePassword(u, pwdUtil.getOldpassword(), pwdUtil.getNewpassword());
		return new ResponseData(status);
	}
}
