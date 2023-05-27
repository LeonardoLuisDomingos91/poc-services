package br.com.jpa.algaworks.jpaalgaworks.controller;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Pedido;
import br.com.jpa.algaworks.jpaalgaworks.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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