package com.algaworks.service;

import com.algaworks.domain.entity.PagamentoCartao;
import com.algaworks.domain.entity.Pedido;
import com.algaworks.domain.enumeration.StatusPagamento;
import com.algaworks.repository.PagamentoCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PagamentoCartaoService {
    @Autowired
    private PagamentoCartaoRepository pagamentoCartaoRepository;
    public void createPagamento(PagamentoCartao pagamentoCartao) {

        var pagamentoCartaoNovo = new PagamentoCartao();
        pagamentoCartaoNovo.setNumero(pagamentoCartao.getNumero());
        pagamentoCartaoNovo.setStatusPagamento(StatusPagamento.PROCESSANDO);
        pagamentoCartaoNovo.setPedido(pagamentoCartao.getPedido());

        pagamentoCartaoRepository.save(pagamentoCartaoNovo);
    }

    public void update(Long id, PagamentoCartao cartao) {

       Optional<PagamentoCartao> pagamentoCartao = pagamentoCartaoRepository.findById(id);

       PagamentoCartao pg = pagamentoCartao.get();

       pg.setNumero(cartao.getNumero());
       pg.setStatusPagamento(StatusPagamento.CANCELADO);
       Pedido pedido = pg.getPedido();
       pedido.setTotal(cartao.getPedido().getTotal());

       pg.setPedido(pedido);

       pagamentoCartaoRepository.save(pg);
    }
}