package br.com.jpa.algaworks.jpaalgaworks.controller;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.ItemPedido;
import br.com.jpa.algaworks.jpaalgaworks.domain.response.ItemPedidoResponse;
import br.com.jpa.algaworks.jpaalgaworks.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/itempedido")
public class ItemPedidoController {
    @Autowired
    private ItemPedidoService itemPedidoService;

    @PostMapping
    public void create(@RequestBody ItemPedido itemPedido) {
        itemPedidoService.createItemPedido(itemPedido);
    }

    @GetMapping("/{id}")
    public ItemPedidoResponse busca(@PathVariable Long id) {
       return itemPedidoService.buscaPorId(id);
    }
}