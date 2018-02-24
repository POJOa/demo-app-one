package com.example.demo.domain.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TopicRepo {
    private final List<Topic> existingTopics = Arrays.asList( new Topic("topicA",LOREM.content),new Topic("topicB","# titleB\ncontent\n## lorem"));

    public Topic get(int id){
        return existingTopics.get(id);
    }

    public List<Topic> findAll(){
        return existingTopics;
    }
}
