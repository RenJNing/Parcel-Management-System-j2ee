package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.Topicdao;
import com.domain.Comment;
import com.domain.Topic;
import com.util.response.Code;

public class Topicservice {
	private Topicdao topicDao;
	public Topicservice() {
		this.topicDao = new Topicdao();
	}
	
	public int createTopic(Topic topic){
		boolean status = topicDao.createTopic(topic);
		if(!status){
			return Code.SYSTEM_ERROR;
		}else{
			return Code.SUCCEED;
		}
	}
	
	public List<Topic> getAllTopic(){
		List<Object> topicObj=topicDao.getAllTopic();
		List<Topic> topics=new ArrayList<Topic>();
		for(Object o:topicObj){
			topics.add((Topic)o);
		}
		return topics;
	}
	
	public List<Comment> getComments(Long topic_id){
		List<Object> commentsObj=topicDao.getComments(topic_id);
		List<Comment> comments=new ArrayList<Comment>();
		for(Object o:commentsObj){
			comments.add((Comment)o);
		}
		return comments;
	}
	
	public int addComment(Comment comment) {
		boolean status = topicDao.addComment(comment);
		if(!status){
			return Code.SYSTEM_ERROR;
		}else{
			return Code.SUCCEED;
		}
	}
}
