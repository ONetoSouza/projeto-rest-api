package br.com.crud.projetorestapi.repository;


import br.com.crud.projetorestapi.model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Integer> {
}
