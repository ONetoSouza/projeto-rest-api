package br.com.crud.projetorestapi.controller;

import br.com.crud.projetorestapi.dto.UsuarioDto;
import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.UsuarioRepository;
import br.com.crud.projetorestapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    //Lista Usuario Especifico
    @GetMapping(path = "/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


    //Lista Todos os Usuarios
    @GetMapping(path = "/list")
    public List<UsuarioModel> listar() {
        return (List<UsuarioModel>) repository.findAll();
    }


    //Salva usuario
    @PostMapping(path = "/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService.salvar(usuarioDto);
    }


    //Alterar Usuario
    @PutMapping(path = "/{codigo}")
    public UsuarioModel alterar(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService.alterar(usuarioDto);
    }


    //Deleta Usuario
    @DeleteMapping(path = "/{codigo}")
    public void deletar(@PathVariable ("codigo") Integer codigo) {
        repository.deleteById(codigo);
    }

}
