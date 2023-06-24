package controller;

import models.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")

public class ProdutosController {

    private List<Produto> produtos = new ArrayList<>();
    public ProdutosController(){
        
    }

    @GetMapping
    public List<Produto> getAll(){

    }
}
