package pe.edu.upc.trabajofinal.serviceinterfaces;

import pe.edu.upc.trabajofinal.entities.Invoices;

import java.util.List;

public interface IInvoicesService {
    public List<Invoices> list();
    public void insert(Invoices i);
    public Invoices listId(int id);
    public void update(Invoices i);
    public void delete(int id);
}
