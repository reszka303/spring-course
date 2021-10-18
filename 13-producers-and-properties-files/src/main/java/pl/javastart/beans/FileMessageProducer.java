package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
@Message(type = Message.MessageType.FILE)
//@PropertySource("classpath:appConfig.properties")
/*
Alternatywny sposób na wstrzyknięcie wartości z plików properties jest
wstrzyknięcie ziarna typu Environment do klasy, w której chcemy pobrać
pewne wartości w tym przypadku klasy FileMessageProducer
 */
public class FileMessageProducer implements MessageProducer {
    @Value("${messageFileProperty}")
    private String fileName;

//    @Autowired
//    Environment env;

    @Override
    public String getMessage() {
        List<String> lines = null;
        try {
//            String fileName = env.getProperty("messageFileProperty");
            Path path = new File(getClass().getResource(fileName).toURI()).toPath();
            lines = Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        String result = "";
        if (lines != null)
            result = lines.stream().reduce(result, (a,b)-> a + b);
        return result;
    }
}
