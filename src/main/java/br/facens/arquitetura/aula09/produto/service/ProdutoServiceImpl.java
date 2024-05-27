package br.facens.arquitetura.aula09.produto.service;

import br.facens.arquitetura.aula09.produto.model.Produto;
import br.facens.arquitetura.aula09.produto.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService{

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> getProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto getProutoPorId(Long id) {
        return produtoRepository.getById(id);
    }


    @Override
    public void addProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
