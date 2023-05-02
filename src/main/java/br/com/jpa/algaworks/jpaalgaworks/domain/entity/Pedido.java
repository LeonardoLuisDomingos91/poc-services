package com.algaworks.domain.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Pedido {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataInicio;

    private LocalDate dataConclucao;

    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto  produto;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    //@JsonManagedReference
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itemPedido;

    @Embedded
    private EnderecoEntregaPedido enderecoEntregaPedido;
    
}