package br.com.jpa.algaworks.jpaalgaworks.service;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Cliente;
import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Pedido;

import br.com.jpa.algaworks.jpaalgaworks.domain.response.ClienteResponse;

import br.com.jpa.algaworks.jpaalgaworks.mapper.ClienteMapper;

import br.com.jpa.algaworks.jpaalgaworks.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteResponse findCliente(Long id) {

        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        Cliente cliente = clienteOptional.get();

        List<Pedido> pedidoList = cliente.getPedidos();

       return clienteMapper.clienteToClienteResponse(cliente, pedidoList);
    }

    public void createCliente(Cliente cliente) {

        Cliente clienteSave = new Cliente();
        clienteSave.setNome(cliente.getNome());
        clienteSave.setGenero(cliente.getGenero());
        clienteSave.setPedidos(cliente.getPedidos());

        clienteRepository.save(clienteSave);

    }
    public void delete(Long id) {

        clienteRepository.deleteById(id);
    }

//    public void update(Long id) {
//
//        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
//
//        Cliente cliente = clienteOptional.get();
//    }
}