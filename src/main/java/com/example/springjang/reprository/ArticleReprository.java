package com.example.springjang.reprository;

import com.example.springjang.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleReprository extends CrudRepository<Article, Long> {
}
