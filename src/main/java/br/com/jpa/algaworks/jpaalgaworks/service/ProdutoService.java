package br.com.jpa.algaworks.jpaalgaworks.service;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Produto;

import br.com.jpa.algaworks.jpaalgaworks.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    public void createProduto(Produto produto) {

        var produtoNovo = new Produto();

        produtoNovo.setNome(produto.getNome());
        produtoNovo.setDescricao(produto.getDescricao());
        produtoNovo.setPreco(new BigDecimal(123));
        produtoNovo.setCategorias(produto.getCategorias());

        produtoRepository.save(produtoNovo);
    }
    public Produto busca(Long id) {
       return produtoRepository.findById(id).get();
    }
}