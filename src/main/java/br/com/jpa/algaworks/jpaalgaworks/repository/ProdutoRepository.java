package com.algaworks.repository;

import com.algaworks.domain.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}