package br.com.jpa.algaworks.jpaalgaworks.repository;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}