package interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Yeni console uygulamasından merhaba.");


        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Kamera");

        ProductDal db = new InMemoryProductDal();
        db.add(product);
        db.add(product2);

        List<Product> products = db.getAll();


        for (Product p: products) {
            System.out.println(p.getName());
        }


        // InMemory => Ram'de
    }
}
