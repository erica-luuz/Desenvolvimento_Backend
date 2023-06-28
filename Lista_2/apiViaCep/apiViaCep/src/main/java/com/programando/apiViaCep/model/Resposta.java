package com.programando.apiViaCep.model;

import java.util.ArrayList;
import java.util.List;

public class Resposta {
    private List<Cep> endereco = new ArrayList<>();

    public List<Cep> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Cep> endereco) {
        this.endereco = endereco;
    }
}
