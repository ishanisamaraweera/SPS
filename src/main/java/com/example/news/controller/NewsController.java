package com.example.news.controller;

import com.example.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    NewsService newsService;

    @GetMapping("/getNewsHeadLines/{category}")
    public List<String> getNewsHeadLines(@PathVariable String category){
        return newsService.getNewsHeadLines(category);
    }
}
