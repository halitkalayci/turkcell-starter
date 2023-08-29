package interfaces;
// DAL => Data Access Layer
// DAO => Data Access Object
//Veritabanı bağlantısı yapan bir paket

import java.util.List;

// Oracle DB
public class OracleDbProductDal implements ProductDal{
    public void add(Product product){
        System.out.println("Product oracle db'e eklendi");
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
        //
    }

    @Override
    public void delete(int id) {

    }
}

// NoSqlDb
// 8:15 => Workshop
