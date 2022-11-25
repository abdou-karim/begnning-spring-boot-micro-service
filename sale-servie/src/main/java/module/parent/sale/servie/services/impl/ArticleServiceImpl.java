package module.parent.sale.servie.services.impl;

import module.parent.sale.servie.dto.ArticlesDto;
import module.parent.sale.servie.entities.Articles;
import module.parent.sale.servie.mappers.ArticleMapper;
import module.parent.sale.servie.services.articles.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final RestTemplate restTemplate;


    ArticleServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public List<ArticlesDto> findAll() {
         WebClient webClient = WebClient.create("http://localhost:3333");


        Mono<Articles[]> articlesDtoMono = webClient.get()
                .uri("/articles")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Articles[].class).log();

        Articles[] articlesList = articlesDtoMono.block();

   /*     return ArticleMapper.INSTANCE.toDtos(Arrays.asList(
                Objects.requireNonNull(restTemplate.getForObject("http://article-service/articles", Articles[].class))
        ));*/

        return ArticleMapper.INSTANCE.toDtos(Arrays.asList(
                Objects.requireNonNull(articlesList)
        ));
    }
}
