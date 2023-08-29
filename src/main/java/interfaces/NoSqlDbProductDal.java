package interfaces;

import java.util.List;

public class NoSqlDbProductDal implements ProductDal{
    public void add(Product product){
    System.out.println("Product nosql'e eklendi");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    public void update(Product product){

    }

    @Override
    public void delete(int id) {

    }
}
