package com.algaworks.controller;

import com.algaworks.domain.entity.Pedido;
import com.algaworks.repository.PedidoRepository;
import com.algaworks.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public void createPedido(@RequestBody Pedido pedido) {

        pedidoService.salvandoPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido buscarPedido(@PathVariable Long id) {
       return pedidoService.busca(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pedidoService.delete(id);
    }

}