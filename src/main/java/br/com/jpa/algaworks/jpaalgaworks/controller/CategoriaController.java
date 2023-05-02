package com.algaworks.controller;

import com.algaworks.domain.entity.Categoria;
import com.algaworks.domain.entity.Cliente;
import com.algaworks.domain.response.ClienteResponse;
import com.algaworks.service.CategoriaService;
import com.algaworks.service.ClienteService;
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