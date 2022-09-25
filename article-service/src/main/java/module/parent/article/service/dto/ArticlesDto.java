package module.parent.article.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link module.parent.article.service.entities.Articles} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticlesDto {
    private  Long id;
    private  String name;
    private  float price;
}