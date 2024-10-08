package com.example.news.repository;

import com.example.news.entity.NewsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<NewsItem, String> {
    @Query("SELECT headline FROM NewsItem NI " +
            "LEFT JOIN NewsItemCategory NIC ON NI.newsItemId = NIC.id.newsId " +
            "LEFT JOIN NewsCategory NC ON NC.categoryId = NIC.id.newsCategoryId " +
            "WHERE NC.categoryId = :category")
    List<String> getNewsHeadLines(String category);
}
