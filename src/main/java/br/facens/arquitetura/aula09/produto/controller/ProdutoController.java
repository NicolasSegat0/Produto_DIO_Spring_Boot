package br.facens.arquitetura.aula09.produto.controller;

import br.facens.arquitetura.aula09.produto.model.Produto;
import br.facens.arquitetura.aula09.produto.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService  produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/all")
    public List<Produto> getProdutos(){
        return produtoService.getProdutos();
    }

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Long id){
        return produtoService.getProutoPorId(id);
    }

    @PostMapping("/add")
    public  void addProduto(@RequestBody Produto prod){
        produtoService.addProduto(prod);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteProduto(@PathVariable Long id){
        produtoService.deleteProduto(id);
    }
}
