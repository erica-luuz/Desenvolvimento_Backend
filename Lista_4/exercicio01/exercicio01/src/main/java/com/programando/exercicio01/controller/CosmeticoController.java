package com.programando.exercicio01.controller;

import com.programando.exercicio01.model.Cosmetico;
import com.programando.exercicio01.repository.CosmeticoRepository;
import com.programando.exercicio01.service.CosmeticoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequestMapping("/cosmeticos")
@Component
public class CosmeticoController {
    private CosmeticoService service = new CosmeticoService(new CosmeticoRepository());

    @GetMapping("/")
    public List<Cosmetico> listarCosmetico(){
        return service.listarCosmetico();
    }
    @GetMapping("/{id}")
    public Cosmetico buscarCosmetico(@PathVariable int id){
        return  service.buscarCosmetico(id);
    }
    @PostMapping
    public boolean adicionarComestico(@RequestBody Cosmestico cosmestico) {
        return service.adicioanarCosmetico(cosmestico);
    }
    @DeleteMapping("/{id}")
    public String excluirCosmetico(@PathVariable int id){
        return service.excluirCosmetico(id);
    }
}
