package br.com.jpa.algaworks.jpaalgaworks.domain.response;

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