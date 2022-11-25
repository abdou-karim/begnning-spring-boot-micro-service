package module.parent.article.service.services.articles;

import module.parent.article.service.dto.ArticlesDto;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ArticleService {
    List<ArticlesDto> findArticles();

    ArticlesDto addArticle(ArticlesDto articlesDto);

}
