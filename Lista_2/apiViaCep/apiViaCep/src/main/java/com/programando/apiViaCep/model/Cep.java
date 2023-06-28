package com.programando.apiViaCep.model;

public class Cep {
    private int cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private int ibge;
    private int gia;
    private int ddd;
    private  int siafi;

    public Cep() {
    }

    public Cep(int cep, String logradouro, String complemento, String bairro, String localidade, String uf, int ibge, int gia, int ddd, int siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

}
