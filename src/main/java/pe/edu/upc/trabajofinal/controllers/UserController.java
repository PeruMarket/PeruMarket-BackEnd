package pe.edu.upc.trabajofinal.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinal.dtos.UserDTO;
import pe.edu.upc.trabajofinal.entities.User;
import pe.edu.upc.trabajofinal.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;
    @GetMapping
    public List<UserDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody UserDTO dto){
        ModelMapper m=new ModelMapper();
        User u=m.map(dto, User.class);
        uS.insert(u);
    }
    @PutMapping
    public void modificar(@RequestBody User dto){
        ModelMapper m=new ModelMapper();
        User u=m.map(dto,User.class);
        uS.update(u);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

}
