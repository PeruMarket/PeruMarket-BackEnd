package pe.edu.upc.trabajofinal.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinal.entities.Product;
import pe.edu.upc.trabajofinal.repositories.IProductRepository;
import pe.edu.upc.trabajofinal.serviceinterfaces.IProductService;

import java.util.List;

@Repository
public class ProductServiceImplement implements IProductService {
    @Autowired
    private IProductRepository pR;

    @Override
    public List<Product> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Product p) {
        pR.save(p);
    }

    @Override
    public Product listId(int id) {
        return pR.findById(id).orElse(new Product());
    }

    @Override
    public void update(Product p) {
        pR.save(p);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
}
