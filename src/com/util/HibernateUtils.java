package com.util;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateUtils {
	private SessionFactory sessionFactory;
	public HibernateUtils() {
		this.sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public boolean save(Object obj) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		boolean status = false;
		try {
			session.save(session.merge(obj));
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return status;
	}
	
	public Object findByHql(String hql, Object[] condition) {
		Session session=sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Object result = null;
		try {
			Query query = session.createQuery(hql);
			if (condition.length != 0)
				for (int i = 0; i < condition.length; i++)
					query.setParameter(i, condition[i]);
			result = query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}
	public List<Object> findByHqlAll(String hql, Object[] condition) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Object> list=null;
		try {
			Query query = session.createQuery(hql);
			if (condition.length != 0)
				for (int i = 0; i < condition.length; i++)
					query.setParameter(i, condition[i]);
			list = query.list();
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
		
	}
	public List<Object> findByHqlAll(String hql) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Object> list=null;
		try {
			Query query = session.createQuery(hql);
			list = query.list();
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
		
	}
	public boolean update(Object obj) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		boolean status = false;
		try {
			session.update(obj);
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			session.close();
		}
		return status;
	}
	
	// TODO:

}
