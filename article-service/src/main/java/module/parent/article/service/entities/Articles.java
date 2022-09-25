package module.parent.article.service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "articles")
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id", nullable = false)
    private Long id;

    @Column(name =  "article_name", nullable = false)
    private String name;

    @Column(name = "article_price", nullable = false)
    private float price;
}
