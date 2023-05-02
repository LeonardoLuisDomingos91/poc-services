package com.algaworks.controller;

import com.algaworks.domain.entity.Pedido;
import com.algaworks.domain.entity.Cliente;

import com.algaworks.domain.response.ClienteResponse;
import com.algaworks.repository.ClienteRepository;
import com.algaworks.repository.PedidoRepository;

import com.algaworks.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void create(@RequestBody Cliente cliente) {

        clienteService.createCliente(cliente);
    }

    @GetMapping("/{id}")
    public ClienteResponse getAll(@PathVariable Long id) {

       return clienteService.findCliente(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        clienteService.delete(id);
    }

//    @PutMapping("/{id}")
//    public void update(@PathVariable Long id) {
//
//        clienteService.update(id);
//    }
}