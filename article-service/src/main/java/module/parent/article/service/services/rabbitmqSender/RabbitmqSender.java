package module.parent.article.service.services.rabbitmqSender;

import module.parent.article.service.dto.ArticlesDto;

public interface RabbitmqSender {
    void Sender(ArticlesDto articlesDto);
}
