package pl.javastart.beans.decorators;

import org.springframework.stereotype.Component;
import pl.javastart.beans.producers.Producer;

@Component
@Decorator(type = Decorator.DecoratorType.LOWER)
public class LowerCaseMessageDecorator implements MessageDecorator{
    @Override
    public String decorate(String msg) {
        return msg.toLowerCase();
    }
}
