package com.bext.springbootweb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bext.springbootweb.model.Topic;

@Service
public class TopicService {
								//convertimos Lista Inmutable a Lista Mutable
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework","Spring Description"),
			new Topic("java","Core Java", "Core java description"),
			new Topic("javascript", "JavaScript", "JavaSript Description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for ( int i = 0; i < topics.size(); i++) {
			Topic t =  topics.get(i);
			if (t.getId().equals(id)){
				topics.set(i ,  topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
