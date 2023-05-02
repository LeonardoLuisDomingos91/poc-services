package com.algaworks.domain.response;

import com.algaworks.domain.entity.Pedido;

import com.algaworks.domain.enumeration.Genero;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ClienteResponse {

    private String nome;

    public Genero genero;

    public List<Pedido> pedidos;
}