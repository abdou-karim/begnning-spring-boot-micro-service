package module.parent.article.service.controllers;

import module.parent.article.service.dto.ArticlesDto;
import module.parent.article.service.services.articles.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ArticleController {
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService){this.articleService = articleService;}

    @GetMapping("/articles")
    List<ArticlesDto> getArticles(){return this.articleService.findArticles();}
}
