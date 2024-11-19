package pe.edu.upc.trabajofinal.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinal.dtos.InvoicesDTO;
import pe.edu.upc.trabajofinal.entities.Invoices;
import pe.edu.upc.trabajofinal.serviceinterfaces.IInvoicesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/invoices")
public class InvoicesController {
    @Autowired
    private IInvoicesService iS;

    @GetMapping
    public List<InvoicesDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,InvoicesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody InvoicesDTO dto){
        ModelMapper m=new ModelMapper();
        Invoices i =m.map(dto, Invoices.class);
        iS.insert(i);
    }
    @PutMapping
    public void modificar(@RequestBody InvoicesDTO dto){
        ModelMapper m=new ModelMapper();
        Invoices i=m.map(dto,Invoices.class);
        iS.update(i);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }

}
