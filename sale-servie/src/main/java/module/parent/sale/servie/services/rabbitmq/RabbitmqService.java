package module.parent.sale.servie.services.rabbitmq;

import module.parent.sale.servie.dto.ArticlesDto;

public interface RabbitmqService {
    void receivedMessage(ArticlesDto articlesDto);
}
