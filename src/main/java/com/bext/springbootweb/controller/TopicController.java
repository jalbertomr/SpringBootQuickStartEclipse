package com.bext.springbootweb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bext.springbootweb.model.Topic;
import com.bext.springbootweb.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
    @RequestMapping("/temas")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
    
    @RequestMapping("/temas/{id}")
    public Topic getTopic(@PathVariable String id) {
    	return topicService.getTopic(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/temas")
    public void addTopic(@RequestBody Topic topic) {
    	topicService.addTopic(topic);
    }
}
