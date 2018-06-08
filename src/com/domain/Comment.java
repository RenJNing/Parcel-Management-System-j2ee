package com.domain;

import java.io.Serializable;

public class Comment  implements Serializable{
	private Long id;
	private String content;
	private String nickname;
	private String time;
	private Long topic_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Long getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(Long topic_id) {
		this.topic_id = topic_id;
	}
	
}
