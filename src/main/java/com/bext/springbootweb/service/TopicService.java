package com.bext.springbootweb.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bext.springbootweb.model.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring Framework","Spring Description"),
			new Topic("java","Core Java", "Core java description"),
			new Topic("javascript", "JavaScript", "JavaSript Description")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
