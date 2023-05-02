package com.algaworks.repository;

import com.algaworks.domain.entity.PagamentoCartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PagamentoCartaoRepository extends JpaRepository<PagamentoCartao, Long> {
}