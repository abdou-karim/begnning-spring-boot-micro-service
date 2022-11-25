package module.parent.article.service.controllers;

import module.parent.article.service.dto.ArticlesDto;
import module.parent.article.service.services.articles.ArticleService;
import module.parent.article.service.services.rabbitmqSender.RabbitmqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ArticleController {
    private final ArticleService articleService;

    private final RabbitmqSender rabbitmqSender;

    @Autowired
    public ArticleController(ArticleService articleService,RabbitmqSender rabbitmqSender){
        this.articleService = articleService;
        this.rabbitmqSender = rabbitmqSender;
    }

    @GetMapping("/articles")
    List<ArticlesDto> getArticles(){return this.articleService.findArticles();}

    @Value("${app.message}")
    private String message;
    @PostMapping("/articles")
    String addArticle(@RequestBody ArticlesDto articlesDto){
        this.articleService.addArticle(articlesDto);
        rabbitmqSender.Sender(articlesDto);
        return message;
    }
}
