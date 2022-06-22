package br.com.crud.projetorestapi.repository;


import br.com.crud.projetorestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
