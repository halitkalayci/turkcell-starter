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

        // İsim dolu mu değil mi?
        // Fiyat 0'dan büyük mü değil mi?

        // Aynı üründen daha önce databasede kayıt açılmış mı?
        // İlgili üründen stok var mı?


        // Business Katmanı => İsteği karşılayan taraf ile (konsol, web, desktop) veri erişim katmanı arasında bir güvenlik duvarı
        // rolü oynar.

        ProductService productService = new ProductServiceImpl(new InMemoryProductDal());
        productService.add(product);
        productService.add(product2);


        ProductService productService1 = new ProductServiceImpl(new OracleDbProductDal());

        // productService => InMemory
        // productService1 => Oracle


        // InMemory => Ram'de
    }
}
