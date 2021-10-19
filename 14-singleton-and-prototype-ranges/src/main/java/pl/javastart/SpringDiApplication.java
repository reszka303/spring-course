package pl.javastart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.beans.MessagePrinter;
import pl.javastart.beans.MessageProducer;

@Configuration
@ComponentScan
public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringDiApplication.class);

//        MessageProducer bean1 = ctx.getBean(MessageProducer.class);
//        System.out.println(bean1.getNumber());
//
//        MessageProducer bean2 = ctx.getBean(MessageProducer.class);
//        System.out.println(bean2.getNumber());

        MessagePrinter bean1 = ctx.getBean(MessagePrinter.class);
        bean1.printMessage();

        MessagePrinter bean2 = ctx.getBean(MessagePrinter.class);
        bean2.printMessage();

        ctx.close();

    }
}
