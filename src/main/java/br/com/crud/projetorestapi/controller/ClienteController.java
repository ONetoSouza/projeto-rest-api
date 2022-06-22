package br.com.crud.projetorestapi.controller;
import br.com.crud.projetorestapi.model.ClienteModel;
import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    //Lista Usuario Especifico
    @GetMapping(path = "/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


    //Salva usuario
    @PostMapping(path = "/salvar")
    public ClienteModel salvar(@RequestBody ClienteModel cliente) {
        return repository.save(cliente);
    }


    //Alterar Usuario
    @PutMapping(path = "/{codigo}")
    public void alterar(@RequestBody ClienteModel cliente) {
        repository.save(cliente);
    }



    //Deleta Usuario
    @DeleteMapping(path = "/{codigo}")
    public void deletar(@PathVariable ("codigo") Integer codigo) {
        repository.deleteById(codigo);
    }


}
