package br.com.jpa.algaworks.jpaalgaworks.domain.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoId implements Serializable {

    @EqualsAndHashCode.Include
    private Long pedidoId;

    @EqualsAndHashCode.Include
    private Long produtoId;

}