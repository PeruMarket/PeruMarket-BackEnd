package pe.edu.upc.trabajofinal.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinal.dtos.ClientDTO;
import pe.edu.upc.trabajofinal.entities.Client;
import pe.edu.upc.trabajofinal.serviceinterfaces.IClientService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private IClientService cS;

    @GetMapping
    public List<ClientDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClientDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ClientDTO dto){
        ModelMapper m=new ModelMapper();
        Client c =m.map(dto, Client.class);
        cS.insert(c);
    }
    @PutMapping
    public void modificar(@RequestBody ClientDTO dto){
        ModelMapper m=new ModelMapper();
        Client c=m.map(dto,Client.class);
        cS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

}
