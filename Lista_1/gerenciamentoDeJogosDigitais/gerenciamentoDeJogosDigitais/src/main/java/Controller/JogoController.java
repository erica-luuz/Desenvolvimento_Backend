package Controller;

import Model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    private List<Jogo> jogos = new ArrayList<>();

    public JogoController(){
        jogos.add(new Jogo(1,"Catan",200));
        jogos.add(new Jogo(2,"Puerto Rico",300));
        jogos.add(new Jogo(3,"Lhama",95));

    }
    @GetMapping
    public List<Jogo> getAll(){
        return jogos;
    }
    @GetMapping("/{id}")
    public Jogo obterJogoPeloId(@PathVariable int id){
        for(Jogo jogo : jogos){
            if(jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }

    @GetMapping("/menor-preco")
    public Jogo ObterJogoComMenorPreco(){
        List<Jogo> jogos = getAll();
        double menorValor = 10000;
        int index = 0;
        for (int i = 0; i < jogos.size(); i++) {
            if (jogos.get(i).getPreco() < menorValor){
                menorValor = jogos.get(i).getPreco();
                index = i;
            }
        }
        return jogos.get(index);
    }

    @PostMapping
    public String AdicionarUmJogo(@RequestBody Jogo jogo){
        for(Jogo novoJogo : jogos){
            if(novoJogo.getId() == jogo.getId()){
                return "Jogo já existente";
            }
        }jogos.add(jogo);
        return "Jogo " + jogo.getNome() + " foi adicionado ao catálogo!";
    }

}
