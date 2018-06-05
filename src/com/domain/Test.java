package com.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test {
	public static void main(String[] args) {
//		1. 读取并解析配置文件 hibernate.cfg.xml                    2.创建SessionFactory
		SessionFactory sf = new Configuration().configure().buildSessionFactory(); 
//		3.创建Session
		Session session=sf.openSession();
	    
    	Transaction trans = session.beginTransaction();
    
		try {
			
//	        Long company_id = createCompany(session);	 
//	    	Company company = (Company) session.load(Company.class, company_id);
//	    	createEmployee(company);
	    	 
//	    	findEmpolyees(session, company);
	    	
//	    	findEmpolyees2(session);
	    	
			testCascade(session);
	    	trans.commit();
	    	 
	    } catch (HibernateException e) {
	        e.printStackTrace();
	        trans.rollback();
	      }
	    }
	
	public static Long createCompany(Session session) throws HibernateException {
        Company company = new Company();
        company.setName("Oracle");
//      将一个临时对象转变为持久化对象
        session.save(company);
        return company.getId();
	}
	
	public static void createEmployee(Company company) {
        Employee emp = new Employee();
        emp.setName("bill");
        
        Employee emp2 = new Employee();
        emp2.setName("gates");

        company.addPerson(emp);
        company.addPerson(emp2);
	} 
	
	public static void testCascade(Session session) {
		Company company = new Company();
        company.setName("Test1");
        
        Employee emp = new Employee();
        emp.setName("em1");
        
        Employee emp2 = new Employee();
        emp2.setName("em2");
        
        session.save(company);        
        //company.addPerson(emp);
        //company.addPerson(emp2);
        //session.save(company);
        
        
        emp.setCompany(company);
        emp2.setCompany(company);
        session.save(emp);
        session.save(emp2);
        
	} 

	
	public static void findEmpolyees(Session session, Company company) throws HibernateException {
		
        String hql="from Employee as emp where emp.company =:COMPANY"; 
        Query query=session.createQuery(hql);
        
        query.setParameter("COMPANY",company);
        
        List<Employee> result = (List<Employee>)query.list();
        for (int i = 0; i < result.size(); i++) {
            
            Employee employee = (Employee) result.get(i);
            System.out.println("employee name is "+employee.getName());
            
        }
	}
	
	public static void findEmpolyees2(Session session) throws HibernateException {
		
        String hql="from Employee as emp where emp.company.name =:NAME"; 
        Query query=session.createQuery(hql);
        
        query.setParameter("NAME","Oracle");
        
        List<Employee> result = (List<Employee>)query.list();
        for (int i = 0; i < result.size(); i++) {
            
            Employee employee = (Employee) result.get(i);
            System.out.println("employee name is "+employee.getName());
            
        }
	}
	
	/*public static void testRoster(Session session) throws HibernateException {
		Student s = new Student();
		s.setName("James");
		
		Course c = new Course();
		c.setName("Basketball");
		
		Set<Course> cs = new HashSet<Course>();
		cs.add(c);
		
		s.setCourses(cs);
		
		session.persist(s);
		
		s = (Student)session.get(Student.class, 1);
        System.out.println(s.getName());
        cs = s.getCourses();
        for (Iterator<Course> iterator = cs.iterator(); iterator.hasNext();) {
            c = (Course) iterator.next();
            System.out.println(c.getName());
        }
	}*/
}
