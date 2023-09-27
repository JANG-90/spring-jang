package com.example.springjang.controller;

import com.example.springjang.dto.ArticleForm;
import com.example.springjang.entity.Article;
import com.example.springjang.reprository.ArticleReprository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j//로깅을 위한 어노테이션
public class ArticleControllre {

    @Autowired
    private ArticleReprository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {

        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        //System.out.println(form.toString());
        log.info(form.toString());

        //1.dto를 변환 Entity
        Article article = form.toEntity();
        //System.out.println(article.toString());
        log.info(article.toString());

        //2.Repository 에게 Entity를 DB안에 저장하게 함.
        Article saved = articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());
        return "";
    }
}
