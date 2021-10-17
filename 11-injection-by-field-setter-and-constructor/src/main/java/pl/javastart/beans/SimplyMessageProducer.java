package pl.javastart.beans;

import org.springframework.stereotype.Component;

@Component
public class SimplyMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
