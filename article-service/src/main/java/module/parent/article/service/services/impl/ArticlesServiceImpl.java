package module.parent.article.service.services.impl;

import module.parent.article.service.dto.ArticlesDto;
import module.parent.article.service.mappers.ArticleMapper;
import module.parent.article.service.repositories.ArticlesRepository;
import module.parent.article.service.services.articles.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticleService {
    private final ArticlesRepository articlesRepository;

    @Autowired
    public ArticlesServiceImpl(ArticlesRepository articlesRepository) {
        this.articlesRepository = articlesRepository;
    }

    @Override
    public List<ArticlesDto> findArticles() {
        return ArticleMapper.INSTANCE.toDtos(this.articlesRepository.findAll());
    }
}
