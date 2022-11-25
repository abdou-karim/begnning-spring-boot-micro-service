package module.parent.article.service.services.impl;

import module.parent.article.service.dto.ArticlesDto;
import module.parent.article.service.services.rabbitmqSender.RabbitmqSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqSenderImpl implements RabbitmqSender {
    /*
    The RabbitTemplate class allows sending and receiving messages with RabbitMQ.
     */
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitmqSenderImpl(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${spring.rabbitmq.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;

    /*
    send() method that calls the convertAndSend() method of the RabbitTemplate class
    and sets exchange routing user to it.
     This convertAndSend() method then pushes the message to exchange with the specified routingkey.
     */
    @Override
    public void Sender(ArticlesDto articlesDto) {
        rabbitTemplate.convertAndSend(exchange,routingkey,articlesDto);
    }
}
