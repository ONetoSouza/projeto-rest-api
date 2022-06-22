package br.com.crud.projetorestapi.controller;
import br.com.crud.projetorestapi.dto.ClienteDto;
import br.com.crud.projetorestapi.model.ClienteModel;
import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.ClienteRepository;
import br.com.crud.projetorestapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    //Lista Usuario Especifico
    @GetMapping(path = "/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return clienteRepository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


    //Salva usuario
    @PostMapping(path = "/salvar")
    public ClienteModel salvar(@RequestBody ClienteDto clienteDto) {
        return clienteService.salvar(clienteDto);
    }


    //Alterar Usuario
    @PutMapping(path = "/{codigo}")
    public ClienteModel alterar(@RequestBody ClienteDto clienteDto) {
        return clienteService.save(clienteDto);
    }



    //Deleta Usuario
    @DeleteMapping(path = "/{codigo}")
    public void deletar(@PathVariable ("codigo") Integer codigo) {
        clienteRepository.deleteById(codigo);
    }


}
