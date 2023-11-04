package gsc.projects.springbootrabbitmq.service;


import gsc.projects.springbootrabbitmq.producer.RabbitMqProducer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProducerService {


    private final RabbitMqProducer rabbitMqProducer;


    public void sendMessage(String message) {
        rabbitMqProducer.sendMessage(message);
    }
}
