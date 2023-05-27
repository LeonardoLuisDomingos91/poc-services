package br.com.jpa.algaworks.jpaalgaworks.repository;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}