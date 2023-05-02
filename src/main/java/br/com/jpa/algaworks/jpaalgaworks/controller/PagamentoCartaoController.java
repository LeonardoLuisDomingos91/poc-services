package com.algaworks.controller;

import com.algaworks.domain.entity.PagamentoCartao;
import com.algaworks.service.PagamentoCartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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