package br.com.crud.projetorestapi.model;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity(name = "produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;
    @Column(nullable = false, length = 50)
    public String descricao;
    @Column(nullable = false, length = 5)
    public String unidade;

    @Column(precision = 9, scale = 2)
    public Double valor;

    public ProdutoModel(String descricao, String unidade, Double valor) {
        this.descricao = descricao;
        this.unidade = unidade;
        this.valor = valor;
    }

    public ProdutoModel() {
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
