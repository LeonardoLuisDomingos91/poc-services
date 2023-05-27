package br.com.jpa.algaworks.jpaalgaworks.domain.entity;

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
@Table(name = "product")
public class Produto {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nome;

    @Column(name = "description")
    private String descricao;

    @Column(name = "price")
    private BigDecimal preco;

    @Column(name = "data_criacao", updatable = false)
    private LocalDate dataCriacao;

    @Column(name = "data_ultima_atualizacao", insertable = false)
    private LocalDate dataUltimaAtualizacao;
    @ManyToMany
    @JoinTable(name = "categoria_produto",
            joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias;

}