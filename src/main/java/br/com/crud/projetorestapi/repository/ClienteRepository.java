package br.com.crud.projetorestapi.repository;

import br.com.crud.projetorestapi.model.ClienteModel;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteModel, Integer> {
}
