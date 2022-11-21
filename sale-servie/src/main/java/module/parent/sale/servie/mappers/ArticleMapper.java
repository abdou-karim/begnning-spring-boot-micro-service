package module.parent.sale.servie.mappers;

import module.parent.sale.servie.dto.ArticlesDto;
import module.parent.sale.servie.entities.Articles;
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
