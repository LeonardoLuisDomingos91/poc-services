package com.algaworks.controller;

import com.algaworks.domain.entity.ItemPedido;

import com.algaworks.domain.response.ItemPedidoResponse;

import com.algaworks.service.ItemPedidoService;

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