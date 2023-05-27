package br.com.jpa.algaworks.jpaalgaworks.mapper;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Cliente;
import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Pedido;
import br.com.jpa.algaworks.jpaalgaworks.domain.response.ClienteResponse;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ClienteMapper {

    public ClienteResponse clienteToClienteResponse(Cliente cliente, List<Pedido> pedidos) {
        var clienteResponse = new ClienteResponse();
        clienteResponse.setNome(cliente.getNome());
        clienteResponse.setGenero(cliente.getGenero());
        clienteResponse.setPedidos(pedidos);
        return clienteResponse;
    }
}