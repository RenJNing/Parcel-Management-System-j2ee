package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.User;
import com.util.LoginData;


@Controller
public class UserController {	
//	@CrossOrigin(origins="*")
	@RequestMapping(value="/user/login")
	public LoginData login(@RequestBody Map<String,String> map, HttpSession session) {
		LoginData loginData = new LoginData();
		String email = map.get("email");  
        String password = map.get("password"); 
        System.out.println("登录请求...username="+email+"  pwd=" + password);
		if("admin".equals(email) && "123456".equals(password))   {  
			loginData.setCode(200); 
			loginData.setMsg("登录成功");
        }else{  
			loginData.setCode(500); 
			loginData.setMsg("登录失败"); 
        }  
        return loginData; 
		
	}
	

}
