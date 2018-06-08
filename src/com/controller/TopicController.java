package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Comment;
import com.domain.Topic;
import com.service.Topicservice;
import com.util.response.Code;
import com.util.response.ResponseData;

@Controller
public class TopicController {
	private Topicservice topicService;
	public TopicController() {
		this.topicService = new Topicservice();
	}
	
	@ResponseBody
	@RequestMapping("/user/newtopic")
	public ResponseData createTopic(@RequestBody Topic topic){
		
		int status = topicService.createTopic(topic);
		return new ResponseData(status);
	}
	
	@ResponseBody
	@RequestMapping(value = "/user/community")
	public ResponseData getTopics() {
		List<Topic> topics = topicService.getAllTopic();
		
		if(topics.isEmpty()) {

			return new ResponseData(Code.NO_TOPIC);
		}
		else {
			return new ResponseData(Code.SUCCEED, topics);
		}
		
	}
	

	@ResponseBody
	@RequestMapping("/user/getcomment/{topic_id}")
	public ResponseData getComments(@PathVariable Long topic_id) {
		List<Comment> comments = topicService.getComments(topic_id);
		
		if(comments.isEmpty()) {
			return new ResponseData(Code.NO_TOPIC);
		}
		else {
			return new ResponseData(Code.SUCCEED, comments);
		}
	}
	
	// 这里的前端如果直接包装成comment丢过来就  直接用 url： "/user/community/addComment"
	// 考虑上面 getCOmments 也直接 "/user/community/getComments"
	@ResponseBody
	@RequestMapping("/user/addcomment")
	public ResponseData addComments(@RequestBody Comment comment) {
		int status = topicService.addComment(comment);
		return new ResponseData(Code.SUCCEED);
	}
}
