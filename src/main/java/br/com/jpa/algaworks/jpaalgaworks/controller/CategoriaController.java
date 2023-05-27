package br.com.jpa.algaworks.jpaalgaworks.controller;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Categoria;
import br.com.jpa.algaworks.jpaalgaworks.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public void create(@RequestBody Categoria categoria) {

        categoriaService.createCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Categoria busca(@PathVariable Long id) {
       return categoriaService.busca(id);
    }
}