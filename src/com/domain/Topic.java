package com.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Topic implements Serializable{
	private Long topic_id;
	private String title;
	private String content;
	private String createtime;
	private String leasttime;
	private String nickname;
	 
	public Long getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(Long topic_id) {
		this.topic_id = topic_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getLeasttime() {
		return leasttime;
	}
	public void setLeasttime(String leasttime) {
		this.leasttime = leasttime;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
