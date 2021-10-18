package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    @Autowired
    @Message(type = Message.MessageType.FILE)
    private MessageProducer producer;

    public void print() {
        System.out.println("Message produced: " + producer.getMessage());
    }
}
