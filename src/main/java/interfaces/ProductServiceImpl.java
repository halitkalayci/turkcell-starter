package interfaces;

public class ProductServiceImpl implements ProductService{
    // Dependency Injection =>
    // constructor'da yüklenmesi
    ProductDal productDal;
    public ProductServiceImpl(ProductDal productDal) {
        this.productDal = productDal;
    }

    @Override
    public void add(Product product) {
        // Business işlevleri

        // Validation => Product nesnesinin isim alanının 3 haneden küçük olması.
        // Business Rule => Aynı isimde ikinci productın bulunamaması kuralı.
        // Cross Cutting Concerns (CCC) => Cacheleme, Loglama, Authorization

        // Bütün bu işlevler kontrol ya da execute edilip çalıştırıldıktan sonra DAL yardımı ile veritabanı işlevleri gerçekleştirilir.

        if(product.getName().length() < 3)
        {
            System.out.println("Ürün ismi 3 haneden uzun olmalıdır.");
            return;
        }
        // Artık veritabanına add isteği atılabilir, tüm kontroller gerçekleşti.
        // DAL
        productDal.add(product);
        System.out.println(product.getName() + " ürün eklendi..");
    }

    @Override
    public void delete(int id) {
        // Kontroller
        // CCC
        // ....

        productDal.delete(id);
    }
}
