package pl.javastart.beans.producers;

import org.springframework.stereotype.Component;

@Component
@Producer(type = Producer.ProducerType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
