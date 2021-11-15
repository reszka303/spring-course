package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.ClientDao;
import pl.javastart.dao.OrderDao;
import pl.javastart.dao.ProductDao;
import pl.javastart.model.Client;
import pl.javastart.model.Order;
import pl.javastart.model.Product;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class SpringJpaBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(SpringJpaBootApplication.class, args);

        ClientDao clientDao = ctx.getBean(ClientDao.class);
        Client client = new Client("Jan", "Kowalski", "Krakowskie przedmieście 23, Warszawa");
        clientDao.save(client);
        System.out.println(client);

        OrderDao orderDao = ctx.getBean(OrderDao.class);
        Order order = new Order("z dostawą do domu");
        order.setClient(client);
        orderDao.save(order);

        List<Product> products = new ArrayList<>();
        ProductDao productDao = ctx.getBean(ProductDao.class);
        Product product1 = new Product("Telewizor LG 42'", 4800.0, "dolby surround");
        Product product2 = new Product("Telefon APple iPhone SE", 2200.0, "pokrowiec gratis");
        products.add(product1);
        products.add(product2);
        productDao.save(product1);
        productDao.save(product2);

        orderDao.addProductsToOrder(order.getId(), products);

        Client getClient = clientDao.get(client.getId());
        System.out.println("\n" + getClient);

        ctx.close();
    }
}
