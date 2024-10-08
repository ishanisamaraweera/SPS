package com.example.news.service;

import com.example.news.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public List<String> getNewsHeadLines(String category){
        return newsRepository.getNewsHeadLines(category);
    }
}
