package pe.edu.upc.trabajofinal.serviceinterfaces;

import pe.edu.upc.trabajofinal.entities.Product;

import java.util.List;

public interface IProductService {
    public List<Product> list();
    public void insert(Product p);
    public Product listId(int id);
    public void update(Product p);
    public void delete(int id);
}
