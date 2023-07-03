package Controller;

import Model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();

    public ProdutoController(){
        produtos.add(new Produto(123,"Arroz",20));
        produtos.add(new Produto(456,"Feijão",8));
        produtos.add(new Produto(789,"Açucar",3));
    }
    @GetMapping
    public List<Produto> getAll(){
       return  produtos;
    }

    @GetMapping("/{codigoDeBarras}")
    public Produto obterPeloCodigoDeBarra(@PathVariable int codigoDeBarras){
        for(Produto produto : produtos){
            if(produto.getCodigoDeBarras() == codigoDeBarras){
               return produto;
            }
        }
        return null;
    }

    @PostMapping
    public String AdicionarUmProduto(@RequestBody Produto produto){
        for(Produto novoProduto : produtos){
            if(novoProduto.getCodigoDeBarras() == produto.getCodigoDeBarras()){
                return "Produto já existente” e não deve realizar a inclusão.";
            }
        }
        produtos.add(produto);
        return "Produto " + produto.getNome() + " foi adicionado ao estoque!";
    }

}
