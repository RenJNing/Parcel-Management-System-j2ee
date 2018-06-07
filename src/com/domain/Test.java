package com.domain;

import java.util.Date;
//import java.sql.Date;
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

import com.util.HibernateUtils;

public class Test {
	public static void main(String[] args) {
		//HibernateUtils h = new HibernateUtils();
//		1. ��ȡ�����������ļ� hibernate.cfg.xml                    2.����SessionFactory
		SessionFactory sf = new Configuration().configure().buildSessionFactory(); 
//		3.����Session
		Session session=sf.openSession();
	    
    	Transaction trans = session.beginTransaction();
    
		try {
			
//	        Long company_id = createCompany(session);	 
//	    	Company company = (Company) session.load(Company.class, company_id);
//	    	createEmployee(company);

//	    	findEmpolyees(session, company);

//	    	findEmpolyees2(session);
	    	
//			testCascade(session);
			Parcel p = new Parcel();
			p.setDate("2018-06-07");
    		createParcel(session,p); 
//			String hql="from User u where u.email=?0 and u.password=?1 ";
//			User u=(User)h.findByHql(hql,new Object[] {"835380624@qq.com","123456"});
//			System.out.println(u);
		
		
		
	    	trans.commit();
	    	 
	    } catch (HibernateException e) {
	        e.printStackTrace();
	        trans.rollback();
	      }
	    }
	
	public static Object findByHql(String hql, Object[] condition) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans = session.beginTransaction();
		Object result = null;
		try {
			Query query = session.createQuery(hql);
			if (condition.length != 0)
				for (int i = 0; i < condition.length; i++)
					query.setParameter(i, condition[i]);
			result = query.uniqueResult();
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}
	
	private static void createUser(Session session, String string, String string2, String string3) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setEmail(string);
		user.setNickname(string2);
		user.setPassword(string3);
		session.save(user);
	}
	private static void createParcel(Session session, Parcel p) {
		// TODO Auto-generated method stub
		session.save(p);
	}

	public static Long createCompany(Session session) throws HibernateException {
        Company company = new Company();
        company.setName("Oracle");
//      ��һ����ʱ����ת��Ϊ�־û�����
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
