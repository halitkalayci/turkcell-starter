package interfaces;

import java.util.List;

public interface ProductDal {
    void add(Product product);  // C
    List<Product> getAll(); // R
    Product getById(int id); // R
    void update(Product product); // U
    void delete(int id);  // D
}
