package br.com.jpa.algaworks.jpaalgaworks.controller;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Cliente;
import br.com.jpa.algaworks.jpaalgaworks.domain.response.ClienteResponse;
import br.com.jpa.algaworks.jpaalgaworks.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

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