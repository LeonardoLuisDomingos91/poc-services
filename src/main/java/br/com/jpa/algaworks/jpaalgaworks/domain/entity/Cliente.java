package br.com.jpa.algaworks.jpaalgaworks.domain.entity;

import br.com.jpa.algaworks.jpaalgaworks.domain.enumeration.Genero;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    public Genero genero;

    @JsonManagedReference
    @OneToMany(mappedBy = "cliente")
    public List<Pedido> pedidos;

}