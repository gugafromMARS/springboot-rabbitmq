package gsc.projects.springbootrabbitmq.producer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMqProducer.class);

    @Value("${rabbitmq.exchange.name]")
    private String exchange;


    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    private RabbitTemplate rabbitTemplate;

    public RabbitMqProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent to exchange -> %s", message));
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}
