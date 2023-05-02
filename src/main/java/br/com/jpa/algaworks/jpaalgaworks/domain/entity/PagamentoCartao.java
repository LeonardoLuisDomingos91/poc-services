package com.algaworks.domain.entity;

import com.algaworks.domain.enumeration.StatusPagamento;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class PagamentoCartao {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    private StatusPagamento statusPagamento;

    @OneToOne(optional = false)
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
}