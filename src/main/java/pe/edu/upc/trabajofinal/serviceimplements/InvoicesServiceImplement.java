package pe.edu.upc.trabajofinal.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajofinal.entities.Invoices;
import pe.edu.upc.trabajofinal.repositories.IInvoicesRepository;
import pe.edu.upc.trabajofinal.serviceinterfaces.IInvoicesService;

import java.util.List;

@Service
public class InvoicesServiceImplement implements IInvoicesService {
    @Autowired
    private IInvoicesRepository iR;
    @Override
    public List<Invoices> list() {
        return iR.findAll();
    }
    @Override
    public void insert(Invoices i) {
        iR.save(i);
    }
    @Override
    public Invoices listId(int id) {
        return iR.findById(id).orElse(new Invoices());
    }
    @Override
    public void update(Invoices i) {
        iR.save(i);
    }
    @Override
    public void delete(int id) {
        iR.deleteById(id);
    }
}
