package br.com.jpa.algaworks.jpaalgaworks.domain.response;

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