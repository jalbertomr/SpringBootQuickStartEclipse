package com.bext.springbootweb.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
