package pe.edu.upc.trabajofinal.serviceinterfaces;

import pe.edu.upc.trabajofinal.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> list();
    public void insert(User u);
    public User listId(int id);
    public void update(User u);
    public void delete(int id);
}
