package com.example.news.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "news_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_item_id")
    private int newsItemId;
    @Column(name = "headline")
    private String headline;
    @Column(name = "complete_news")
    private String completeNews;

}
