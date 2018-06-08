package com.dao;

import java.util.List;

import com.domain.Comment;
import com.domain.Parcel;
import com.domain.Topic;
import com.util.HibernateUtils;

public class Topicdao {
	private HibernateUtils hibernateUtils;
	public Topicdao() {
		this.hibernateUtils = new HibernateUtils();
	}
	
	public boolean createTopic(Topic topic) {
		return hibernateUtils.save(topic);
	}
	
	public List<Object> getAllTopic(){
		String hql="from Topic order by leasttime";
		return hibernateUtils.findByHqlAll(hql);
	}
	
	public List<Object> getComments(Long topic_id){
		String hql="from Comment c where c.topic_id = ?0 order by time";
		return hibernateUtils.findByHqlAll(hql, new Object[] {topic_id});
	}
	
	public boolean addComment(Comment comment) {
		return hibernateUtils.save(comment);
	}
}
