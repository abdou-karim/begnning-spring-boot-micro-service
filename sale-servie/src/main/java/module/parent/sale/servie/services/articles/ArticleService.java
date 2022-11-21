package module.parent.sale.servie.services.articles;

import module.parent.sale.servie.dto.ArticlesDto;

import java.util.List;

public interface ArticleService {
    List<ArticlesDto> findAll();
}
