package com.example.news.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class NewsItemCategoryId implements Serializable {
    @Column(name = "news_id")
    private int newsId;
    @Column(name = "news_category_id")
    private int newsCategoryId;
}