package gsc.projects.springbootrabbitmq.service;


import gsc.projects.springbootrabbitmq.dto.User;
import gsc.projects.springbootrabbitmq.producer.RabbitMqJsonProducer;
import gsc.projects.springbootrabbitmq.producer.RabbitMqProducer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProducerService {


    private final RabbitMqProducer rabbitMqProducer;

    private final RabbitMqJsonProducer rabbitMqJsonProducer;


    public void sendMessage(String message) {
        rabbitMqProducer.sendMessage(message);
    }

    public void sendJsonMessage(User user) {
        rabbitMqJsonProducer.sendJson(user);
    }
}
