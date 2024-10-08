package com.example.news.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "news_item_category")
@NoArgsConstructor
@AllArgsConstructor
public class NewsItemCategory {
    @EmbeddedId
    private NewsItemCategoryId id;
}
