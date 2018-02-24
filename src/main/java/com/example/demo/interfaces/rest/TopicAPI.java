package com.example.demo.interfaces.rest;

import java.util.List;

import com.example.demo.domain.topic.Topic;
import com.example.demo.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/topic/")
public class TopicAPI {
    @Autowired TopicService topicService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Topic get(@PathVariable int id) {
        return topicService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public List<Topic> list() {
        return topicService.findAll();
    }

}
