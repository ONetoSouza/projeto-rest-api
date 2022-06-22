package br.com.crud.projetorestapi.dto;

public class ProdutoDto {

    public String descricao;
    public String unidade;
    public Double valor;

    public String getDescricao() {
        return descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public Double getValor() {
        return valor;
    }
}
