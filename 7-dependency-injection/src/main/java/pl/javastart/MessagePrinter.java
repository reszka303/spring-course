package pl.javastart;

public class MessagePrinter {
    private MessageProducer messageProducer = new SimpleMessageProducer();

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
