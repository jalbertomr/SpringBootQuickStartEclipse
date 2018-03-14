package com.bext.springbootweb.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bext.springbootweb.model.Topic;

@RestController
public class TopicController {
    @RequestMapping("/temas")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring","Spring Framework","Spring Description"),
				new Topic("java","Core Java", "Core java description"),
				new Topic("javascript", "JavaScript", "JavaSript Description")
				);
	}
}
