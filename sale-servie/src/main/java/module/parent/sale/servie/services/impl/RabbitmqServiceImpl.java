package module.parent.sale.servie.services.impl;

import module.parent.sale.servie.dto.ArticlesDto;
import module.parent.sale.servie.services.rabbitmq.RabbitmqService;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

@Service
public class RabbitmqServiceImpl implements RabbitmqService, RabbitListenerConfigurer {
    private final Logger logger = LoggerFactory.getLogger(RabbitmqServiceImpl.class);

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    @Override
    public void receivedMessage(ArticlesDto articlesDto) {
        logger.info("Article Details Received is.. "+articlesDto);
    }

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {

    }
}
