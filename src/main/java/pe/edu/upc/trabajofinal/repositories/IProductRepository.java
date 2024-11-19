package pe.edu.upc.trabajofinal.repositories;

import org.springdoc.core.providers.JavadocProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinal.entities.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
}
