package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Person;

@Controller
@RequestMapping("/mvc")
public class Hello {
    @RequestMapping("/hello1")
    public String hello(String name, int age){
    System.out.println(name + ", " + age);
        return "hello";
    }
    
    @RequestMapping("/hello2")
    public String hello(Person p){
    System.out.println(p.getName() + ", " + p.getAge());
        return "hello";
    }
    
    @RequestMapping(value = "/resBody", method = RequestMethod.GET) 
    @ResponseBody  
    public Map<String, String> sendJson() { 
    	System.out.println("sendJson...");
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("name", "abc");
    	map.put("age", "101");
        return map;
    }
    
    @RequestMapping(value = "/getJson", method = RequestMethod.POST) 
    @ResponseBody  
    public List<Person> getJson(@RequestBody List<Person> users) { 
    	System.out.println("getJson...");
         for (Person p : users) {
        	 System.out.println(p);
         }
         return users;
    }


}
