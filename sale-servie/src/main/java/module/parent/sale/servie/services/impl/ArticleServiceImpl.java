package module.parent.sale.servie.services.impl;

import module.parent.sale.servie.dto.ArticlesDto;
import module.parent.sale.servie.entities.Articles;
import module.parent.sale.servie.mappers.ArticleMapper;
import module.parent.sale.servie.services.articles.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<ArticlesDto> findAll() {
        return ArticleMapper.INSTANCE.toDtos(Arrays.asList(
                Objects.requireNonNull(restTemplate.getForObject("http://article-service/articles", Articles[].class))
        ));
    }
}
