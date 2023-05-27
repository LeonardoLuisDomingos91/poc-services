package br.com.jpa.algaworks.jpaalgaworks.domain.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@IdClass(ItemPedidoId.class)
@Entity
public class ItemPedido {

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "pedido_id")
    private Long pedidoId;

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "produto_id")
    private Long produtoId;

    private BigDecimal preco;

    private Integer quantidade;
    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "pedido_id", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id", insertable = false, updatable = false)
    private Produto produto;
}