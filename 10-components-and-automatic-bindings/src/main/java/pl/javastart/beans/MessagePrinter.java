package pl.javastart.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class MessagePrinter {
//    @Inject
/*
w miejscach gdzie stosowaliśmy adnotację @Autowired możemy wykorzystać alternatywnie adnotację @Inject.
Na co dzień nie spotkasz się z tym podejściem zbyt często,
jednak warto wiedzieć, że taka możliwość istnieje.
 */
    @Autowired
    private MessageProducer producer;

    MessagePrinter() {}

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        System.out.println(producer.getMessage());
    }
}