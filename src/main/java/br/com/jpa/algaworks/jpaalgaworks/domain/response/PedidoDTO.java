package com.algaworks.domain.response;

import com.algaworks.domain.entity.EnderecoEntregaPedido;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class PedidoDTO {

    private LocalDate dataInicio;

    private LocalDate dataConclucao;

//    private BigDecimal total;
//
//    private EnderecoEntregaPedido enderecoEntregaPedido;
}