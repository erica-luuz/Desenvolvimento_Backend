package com.programando.exercicio01.service;

import com.programando.exercicio01.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CosmeticoService {
    public List<Cosmetico> listarCosmetico(){
        return repository.listarCosmetico();
    }
    public Cosmetico buscarCosmetico(int id) {
        return repository.buscarCosmetico(id);
    }
    public boolean adicionarCosmetico(Cosmetico cosmetico) {
        return repository.adicionarCosmetico(cosmetico);
    }
    public String excluirCosmetico(int id){
        return repository.excluirCosmetico(id);
    }
}
