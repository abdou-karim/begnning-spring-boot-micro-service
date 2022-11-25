package module.parent.sale.servie.controllers;

import module.parent.sale.servie.dto.ArticlesDto;
import module.parent.sale.servie.services.articles.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleControler {
    private final ArticleService articleService;

    SaleControler(ArticleService articleService){
        this.articleService = articleService;
    }

    @GetMapping("/sale/articles")
    List<ArticlesDto> getAllArticles(){return this.articleService.findAll();}
}
