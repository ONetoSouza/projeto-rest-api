package br.com.crud.projetorestapi.controller;

import br.com.crud.projetorestapi.dto.ProdutoDto;
import br.com.crud.projetorestapi.dto.UsuarioDto;
import br.com.crud.projetorestapi.model.ProdutoModel;
import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.ProdutoRepository;
import br.com.crud.projetorestapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoService produtoService;

    //Lista Produto Especifico
    @GetMapping(path = "/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return produtoRepository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    //Lista Todos os Produtos
    @GetMapping(path = "/list")
    public List<ProdutoModel> listar() {
        return (List<ProdutoModel>) produtoRepository.findAll();
    }

    //Salva produtos
    @PostMapping(path = "/salvar")
    public ProdutoModel salvar(@RequestBody ProdutoDto produtoDto) {
        return produtoService.salvar(produtoDto);
    }

    //Alterar Produto
    @PutMapping(path = "/{codigo}")
    public ProdutoModel alterar(@RequestBody ProdutoDto produtoDto) {
        return produtoService.alterar(produtoDto);
    }

    //Deleta Produto
    @DeleteMapping(path = "/{codigo}")
    public void deletar(@PathVariable ("codigo") Integer codigo) {
        produtoRepository.deleteById(codigo);
    }
}
