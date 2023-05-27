package br.com.jpa.algaworks.jpaalgaworks.repository;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.PagamentoCartao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface PagamentoCartaoRepository extends JpaRepository<PagamentoCartao, Long> {
}