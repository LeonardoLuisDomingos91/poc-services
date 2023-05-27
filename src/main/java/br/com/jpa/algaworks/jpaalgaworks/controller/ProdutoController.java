package br.com.jpa.algaworks.jpaalgaworks.controller;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Produto;
import br.com.jpa.algaworks.jpaalgaworks.service.ProdutoService;
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