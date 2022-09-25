package module.parent.article.service.repositories;

import module.parent.article.service.entities.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends JpaRepository<Articles, Long> {
}