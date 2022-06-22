package br.com.crud.projetorestapi.model;

import javax.persistence.*;

@Entity(name = "cliente")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = true, length = 20)
    public String contato;
    @Column(nullable = false, length = 20)
    public String cpfCNPJ;
    @Column(nullable = true, length = 20)
    public String rgIE;
    @Column(nullable = true, length = 60)
    public String email;
    @Column(nullable = false, length = 80)
    public String logradouro;
    @Column(nullable = false, length = 60)
    public String bairro;
    @Column(nullable = false, length = 60)
    public String cidade;

    //Construtor
    public ClienteModel(String nome, String contato, String cpfCNPJ, String rgIE, String email, String logradouro, String bairro, String cidade) {
        this.nome = nome;
        this.contato = contato;
        this.cpfCNPJ = cpfCNPJ;
        this.rgIE = rgIE;
        this.email = email;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    //Get and Setter
    public ClienteModel() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }

    public String getRgIE() {
        return rgIE;
    }

    public void setRgIE(String rgIE) {
        this.rgIE = rgIE;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
