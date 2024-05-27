package br.facens.arquitetura.aula09.produto.service;

import br.facens.arquitetura.aula09.produto.model.Produto;

import java.util.List;

public interface ProdutoService {
    public List<Produto> getProdutos();
    public Produto getProutoPorId(Long id);
    public void addProduto(Produto id);
    public void deleteProduto(Long id);
}
