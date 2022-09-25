package module.parent.article.service.datasFixture;

import lombok.AllArgsConstructor;
import module.parent.article.service.entities.Articles;
import module.parent.article.service.repositories.ArticlesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@AllArgsConstructor
@Component
@ConditionalOnProperty(name = "app.db-init", havingValue = "true")
public class ArticlesFixture implements CommandLineRunner {
    private ArticlesRepository articlesRepository;


    @Override
    public void run(String... args) throws Exception {
        articlesRepository.saveAll(
                Arrays.asList(
                        new Articles(null,"article_1",1500),
                        new Articles(null,"article_2",2000),
                        new Articles(null,"article_3",2500),
                        new Articles(null,"article_4",3000),
                        new Articles(null,"article_5",3500)
                )
        );}
}