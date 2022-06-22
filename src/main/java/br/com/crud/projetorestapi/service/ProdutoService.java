package br.com.crud.projetorestapi.service;

import br.com.crud.projetorestapi.dto.ProdutoDto;
import br.com.crud.projetorestapi.dto.UsuarioDto;
import br.com.crud.projetorestapi.model.ProdutoModel;
import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel salvar(ProdutoDto produtoDto) {
        ProdutoModel produto = new ProdutoModel(produtoDto.getDescricao(),
                produtoDto.getUnidade(), produtoDto.getValor());
        return produtoRepository.save(produto);
    }

    public ProdutoModel alterar(ProdutoDto produtoDto) {
        ProdutoModel produto = new ProdutoModel(produtoDto.getDescricao(),
                produtoDto.getUnidade(), produtoDto.getValor());
        return produtoRepository.save(produto);

    }
}
