//package pl.javastart;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import pl.javastart.model.Book;
//import pl.javastart.service.BookRepository;
//import pl.javastart.service.GenericRepository;
//
//import java.awt.print.Book;
//
//@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//public class SpringAopBootApplication {
//    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx = SpringApplication.run(SpringAopBootApplication.class);
//
//        GenericRepository<String, Book> repo = ctx.getBean(BookRepository.class);
//        repo.add(new Book("1111111111111", "Pierwsza", "Pierwszy autor"));
//        repo.add(new Book("2222222222222", "Druga", "Drugi autor"));
//        repo.add(new Book("3333333333333", "Trzecia", "Trzeci autor"));
////        repo.add(null);
////        Book book = repo.get("11111111");
//        Book book = repo.get("1111111111111");
//        System.out.println(book);
//
//        ctx.close();
//
//    }
//}
