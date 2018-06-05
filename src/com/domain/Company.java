package com.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Company implements Serializable {
	private Long id;
    private String name;
    private Set persons = new HashSet();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getPersons() {
		return persons;
	}
	public void setPersons(Set persons) {
		this.persons = persons;
	}
	public void addPerson(Employee person) 
    {        
    	persons.add(person);    
    }
    
    public void removePerson(Employee person) 
    {        
    	persons.remove(person);    
    }
}
