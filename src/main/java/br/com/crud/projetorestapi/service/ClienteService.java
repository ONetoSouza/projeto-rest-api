package br.com.crud.projetorestapi.service;

import br.com.crud.projetorestapi.dto.ClienteDto;
import br.com.crud.projetorestapi.model.ClienteModel;
import br.com.crud.projetorestapi.model.UsuarioModel;
import br.com.crud.projetorestapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel salvar(ClienteDto clienteDto) {
        ClienteModel cliente = new ClienteModel(clienteDto.getNome(), clienteDto.getContato(),
                clienteDto.getCpfCNPJ(), clienteDto.getRgIE(), clienteDto.getEmail(), clienteDto.getLogradouro(),
                clienteDto.getBairro(), clienteDto.getCidade());
        return clienteRepository.save(cliente);
    }


    public ClienteModel save(ClienteDto clienteDto) {
        ClienteModel cliente = new ClienteModel(clienteDto.getNome(), clienteDto.getContato(),
                clienteDto.getCpfCNPJ(), clienteDto.getRgIE(), clienteDto.getEmail(), clienteDto.getLogradouro(),
                clienteDto.getBairro(), clienteDto.getCidade());
        clienteRepository.save(cliente);
        return cliente;
    }
}
