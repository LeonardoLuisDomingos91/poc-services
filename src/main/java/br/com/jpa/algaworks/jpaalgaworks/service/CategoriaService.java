package com.algaworks.service;

import com.algaworks.domain.entity.Categoria;
import com.algaworks.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void createCategoria(Categoria categoria) {

        Categoria categoria1 = new Categoria();
        categoria1.setNome("Celular");

        categoriaRepository.save(categoria1);

    }
    public Categoria busca(Long id) {

       return categoriaRepository.findById(id).get();
    }
}