package com.algaworks.domain.response;

import com.algaworks.domain.entity.Pedido;
import com.algaworks.domain.entity.Produto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonSerialize
public class ItemPedidoResponse {

    private BigDecimal preco;

    private Integer quantidade;
    //@JsonIgnore
    private PedidoDTO pedidoDTO;
    //@JsonIgnore
    private ProdutoDTO produtoDTO;
}