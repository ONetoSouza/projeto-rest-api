package br.com.crud.projetorestapi.service;

import br.com.crud.projetorestapi.dto.UsuarioDto;
import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

//    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
//        return repository.findById(codigo)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());

    public UsuarioModel salvar(UsuarioDto usuarioDto) {
        UsuarioModel usuario = new UsuarioModel(usuarioDto.getNome(), usuarioDto.getLogin(), usuarioDto.getSenha());
        return repository.save(usuario);
    }

    public UsuarioModel alterar(UsuarioDto usuarioDto) {
        UsuarioModel usuario = new UsuarioModel(usuarioDto.getNome(), usuarioDto.getLogin(), usuarioDto.getSenha());
        return repository.save(usuario);
    }
}
