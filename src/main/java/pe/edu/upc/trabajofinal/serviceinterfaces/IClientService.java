package pe.edu.upc.trabajofinal.serviceinterfaces;

import pe.edu.upc.trabajofinal.entities.Client;

import java.util.List;

public interface IClientService {
    public List<Client> list();
    public void insert(Client c);
    public Client listId(int id);
    public void update(Client c);
    public void delete(int id);
}
