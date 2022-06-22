package br.com.crud.projetorestapi.dto;

import javax.persistence.Column;

public class ClienteDto {

    public String nome;
    public String contato;
    public String cpfCNPJ;
    public String rgIE;
    public String email;
    public String logradouro;
    public String bairro;
    public String cidade;


    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public String getRgIE() {
        return rgIE;
    }

    public String getEmail() {
        return email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
}
