package com.algaworks.mapper;

import com.algaworks.domain.entity.Cliente;
import com.algaworks.domain.entity.Pedido;
import com.algaworks.domain.response.ClienteResponse;
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