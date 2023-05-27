package br.com.jpa.algaworks.jpaalgaworks.repository;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.ItemPedido;
import br.com.jpa.algaworks.jpaalgaworks.domain.entity.ItemPedidoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoId> {

}