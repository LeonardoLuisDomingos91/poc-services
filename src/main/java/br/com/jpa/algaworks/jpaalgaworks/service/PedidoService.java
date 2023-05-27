package br.com.jpa.algaworks.jpaalgaworks.service;

import br.com.jpa.algaworks.jpaalgaworks.domain.entity.EnderecoEntregaPedido;
import br.com.jpa.algaworks.jpaalgaworks.domain.entity.Pedido;
import br.com.jpa.algaworks.jpaalgaworks.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.time.LocalDate;
@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    public void salvandoPedido(Pedido pedido) {

        var pedidoSalvo = new Pedido();
        pedido.setDataInicio(LocalDate.now());
        pedido.setDataConclucao(LocalDate.now());
        pedido.setTotal(new BigDecimal(100));

        var enderecoEntregaPedido = new EnderecoEntregaPedido();
        enderecoEntregaPedido.setCidade(pedido.getEnderecoEntregaPedido().getCidade());
        enderecoEntregaPedido.setBairro(pedido.getEnderecoEntregaPedido().getBairro());
        enderecoEntregaPedido.setNumero(pedido.getEnderecoEntregaPedido().getNumero());
        enderecoEntregaPedido.setComplemento(pedido.getEnderecoEntregaPedido().getComplemento());
        enderecoEntregaPedido.setCep(pedido.getEnderecoEntregaPedido().getCep());
        enderecoEntregaPedido.setLogradouro(pedido.getEnderecoEntregaPedido().getLogradouro());
        enderecoEntregaPedido.setEstado(pedido.getEnderecoEntregaPedido().getEstado());

        pedido.setEnderecoEntregaPedido(enderecoEntregaPedido);

        pedidoRepository.save(pedido);
    }
    public void delete(Long id) {
        pedidoRepository.deleteById(id);
    }
    public Pedido busca(Long id) {
        return pedidoRepository.findById(id).get();
    }
}