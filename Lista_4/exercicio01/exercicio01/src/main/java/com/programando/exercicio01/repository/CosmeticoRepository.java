package com.programando.exercicio01.repository;

import com.programando.exercicio01.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CosmeticoRepository {
    public List<Cosmetico> listarCosmetico(){
        return list;
    }
    public Cosmetico buscarCosmetico(int id){
        for(Cosmetico cosmetico: list){
            if(cosmetico.getId() == id) {
                return  cosmetico;
            }
        }
        return null;
    }
    public boolean adicionarCosmetico(Cosmetico cosmetico) {
        for (Cosmetico cosmetico: list){
            if(cosmetico.getId() == id){
                return "Impossivel cadastrar! cosmético já consta no banco"
            }
        list.add(cosmetico);
            return "Cosmético " + cosmetico.getNome() + "cadastrado"

    }
    public String excluirCosmetico(int id) {
        for (Cosmetico cosmetico: list){
            if(cosmetico.getId() == id){
                list.remove(cosmetico);
                return "Cosmetico " + cosmetico.getNome() + " removido com sucesso ";
            }
        }
        return "Cosmetico inexixtente";
    }
}
