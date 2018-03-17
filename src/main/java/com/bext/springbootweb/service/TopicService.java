package com.bext.springbootweb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bext.springbootweb.model.Topic;
import com.bext.springbootweb.model.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
								//convertimos Lista Inmutable a Lista Mutable
/*	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework","Spring Description"),
			new Topic("java","Core Java", "Core java description"),
			new Topic("javascript", "JavaScript", "JavaSript Description")
			));
	*/
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll()
	    //.forEach(t -> topics.add(t));   //tambien asi
		.forEach(topics::add);			  //referencia al metodo
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
