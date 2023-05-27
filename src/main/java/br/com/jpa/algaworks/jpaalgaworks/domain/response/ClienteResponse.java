package br.com.jpa.algaworks.jpaalgaworks.domain.response;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Pedido;
import br.com.jpa.algaworks.jpaalgaworks.domain.enumeration.Genero;
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