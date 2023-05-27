package br.com.jpa.algaworks.jpaalgaworks.domain.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class ProdutoDTO {

    private String nome;

    //private String descricao;

    private BigDecimal preco;

    //private LocalDate dataCriacao;

    //private LocalDate dataUltimaAtualizacao;
}