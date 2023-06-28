package com.programando.apiViaCep.controller;

import com.programando.apiViaCep.model.Resposta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/endereco")
public class CepController {
    @GetMapping("/{cep}")
    public Resposta obterCep(@PathVariable int cep){
        String url = "https://viacep.com.br/ws/{cep}/json/";

        RestTemplate restTemplate = new RestTemplate();
        Resposta resposta = restTemplate.getForObject(url, Resposta.class);
        return resposta;
    }
}
