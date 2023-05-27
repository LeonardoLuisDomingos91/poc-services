package br.com.jpa.algaworks.jpaalgaworks.controller;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.PagamentoCartao;
import br.com.jpa.algaworks.jpaalgaworks.service.PagamentoCartaoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentocartao")
public class PagamentoCartaoController {

    @Autowired
    private PagamentoCartaoService pagamentoCartaoService;

    @PostMapping
    public void createPagamentoCartao(@RequestBody PagamentoCartao pagamentoCartao) {

        pagamentoCartaoService.createPagamento(pagamentoCartao);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody PagamentoCartao cartao) {
        pagamentoCartaoService.update(id, cartao);
    }

}