package br.facens.arquitetura.aula09.produto.repository;

import br.facens.arquitetura.aula09.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
