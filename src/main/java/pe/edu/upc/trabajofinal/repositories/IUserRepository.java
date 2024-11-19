package pe.edu.upc.trabajofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajofinal.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}
