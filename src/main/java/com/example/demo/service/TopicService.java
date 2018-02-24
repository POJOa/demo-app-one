package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import com.example.demo.domain.topic.Topic;
import com.example.demo.domain.topic.TopicRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired TopicRepo topicRepo;

    public Topic get(int id){
        return topicRepo.get(id);
    }

    public List<Topic> findAll(){
        return topicRepo.findAll();
    }
}
