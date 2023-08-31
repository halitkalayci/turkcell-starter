package interfaces;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductDal implements ProductDal{
    // C#

    // List => Interface
    // ArrayList => Class

    // CRUD =>
    // Create => Db'de yeni bir kayıt oluşturmak
    // Read => DB'Deki verileri almak/okumak
    // Update
    // Delete

    // DAL,DAO => CRUD işlemlerini kodlarız..
    private List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public void update(Product product) {
        //
    }

    @Override
    public void delete(int id) {

    }
}
