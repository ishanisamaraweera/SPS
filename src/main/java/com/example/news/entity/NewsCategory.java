package com.example.news.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "news_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "category_des")
    private String categoryDes;
}
