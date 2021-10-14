package pl.javastart;

public class Main {
    public static void main(String[] args) {
        MessageProducer fileMessageProducer = new FileMessageProducer();
        MessagePrinter fileMessagePrinter = new MessagePrinter(fileMessageProducer);
        fileMessagePrinter.printMessage();

        MessageProducer simpleMessageProducer = new SimpleMessageProducer();
        MessagePrinter simpleMessagePrinter = new MessagePrinter(simpleMessageProducer);
        simpleMessagePrinter.printMessage();
    }
}
