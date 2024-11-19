package pe.edu.upc.trabajofinal.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinal.entities.Client;
import pe.edu.upc.trabajofinal.repositories.IClientRepository;
import pe.edu.upc.trabajofinal.serviceinterfaces.IClientService;

import java.util.List;

@Service
public class ClientServiceImplement implements IClientService {
    @Autowired
    private IClientRepository cR;
    @Override
    public List<Client> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Client c) {
        cR.save(c);
    }

    @Override
    public Client listId(int id) {
        return cR.findById(id).orElse(new Client());
    }

    @Override
    public void update(Client c) {
        cR.save(c);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }
}
