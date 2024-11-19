package pe.edu.upc.trabajofinal.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinal.entities.User;
import pe.edu.upc.trabajofinal.repositories.IUserRepository;
import pe.edu.upc.trabajofinal.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public List<User> list() {
        return uR.findAll();
    }

    @Override
    public void insert(User u) {
uR.save(u);
    }

    @Override
    public User listId(int id) {
        return uR.findById(id).orElse(new User());
    }

    @Override
    public void update(User u) {
uR.save(u);
    }

    @Override
    public void delete(int id) {
uR.deleteById(id);
    }
}
