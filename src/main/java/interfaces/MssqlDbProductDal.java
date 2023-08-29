package interfaces;

import java.util.List;

public class MssqlDbProductDal implements ProductDal{

    @Override
    public void add(Product product) {
        // MSSQL bağlantısı
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
