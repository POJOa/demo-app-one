package com.example.demo.interfaces.view;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopicController {
    @Autowired TopicService topicService;

    @RequestMapping("/")
    public String list(Model model){
        model.addAttribute("topics", topicService.findAll());
        return "topic/list";
    }

    @RequestMapping("/{id}")
    public String list(Model model,@PathVariable final int id){
        model.addAttribute("t", topicService.get(id));
        return "topic/detail";
    }

}
