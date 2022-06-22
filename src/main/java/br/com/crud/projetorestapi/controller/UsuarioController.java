package br.com.crud.projetorestapi.controller;

import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

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
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario) {
        return repository.save(usuario);
    }


    //Alterar Usuario
    @PutMapping(path = "/{codigo}")
    public void alterar(@RequestBody UsuarioModel usuario) {
        repository.save(usuario);
    }



    //Deleta Usuario
    @DeleteMapping(path = "/{codigo}")
    public void deletar(@PathVariable ("codigo") Integer codigo) {
        repository.deleteById(codigo);
    }


}
