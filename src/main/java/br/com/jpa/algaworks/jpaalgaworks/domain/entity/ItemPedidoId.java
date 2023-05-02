package com.algaworks.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
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