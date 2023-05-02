package com.algaworks.controller;

import com.algaworks.domain.entity.Produto;
import com.algaworks.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public void createProduto(@RequestBody Produto produto) {
        produtoService.createProduto(produto);
    }

    @GetMapping("/{id}")
    public Produto buscaProduto(@PathVariable Long id) {
       return produtoService.busca(id);
    }
}