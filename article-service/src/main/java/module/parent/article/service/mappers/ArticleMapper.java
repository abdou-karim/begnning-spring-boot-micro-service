package module.parent.article.service.mappers;

import module.parent.article.service.dto.ArticlesDto;
import module.parent.article.service.entities.Articles;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface ArticleMapper {
    ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);

    Articles toEntity(ArticlesDto articlesDto);

    ArticlesDto toDto(Articles articles);

    List<ArticlesDto> toDtos(List<Articles> articlesList);
}
