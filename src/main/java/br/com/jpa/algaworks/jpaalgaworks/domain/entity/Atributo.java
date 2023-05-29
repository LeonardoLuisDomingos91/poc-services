package br.com.jpa.algaworks.jpaalgaworks.domain.entity;

import jakarta.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Atributo {

    private String nome;

    private String valor;
}