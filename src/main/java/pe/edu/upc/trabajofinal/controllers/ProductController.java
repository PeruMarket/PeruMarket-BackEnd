package pe.edu.upc.trabajofinal.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajofinal.dtos.ProductDTO;
import pe.edu.upc.trabajofinal.entities.Product;
import pe.edu.upc.trabajofinal.serviceinterfaces.IProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService pS;

    @GetMapping
    public List<ProductDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ProductDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ProductDTO dto){
        ModelMapper m=new ModelMapper();
        Product p =m.map(dto, Product.class);
        pS.insert(p);
    }
    @PutMapping
    public void modificar(@RequestBody ProductDTO dto){
        ModelMapper m=new ModelMapper();
        Product p=m.map(dto,Product.class);
        pS.update(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

}
