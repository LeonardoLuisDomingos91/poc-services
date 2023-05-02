package com.algaworks.repository;

import com.algaworks.domain.entity.ItemPedido;
import com.algaworks.domain.entity.ItemPedidoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoId> {

}