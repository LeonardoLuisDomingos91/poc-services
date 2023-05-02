package com.algaworks.service;

import com.algaworks.domain.entity.ItemPedido;
import com.algaworks.domain.entity.ItemPedidoId;
import com.algaworks.domain.entity.Pedido;
import com.algaworks.domain.entity.Produto;
import com.algaworks.domain.response.ItemPedidoResponse;
import com.algaworks.domain.response.PedidoDTO;
import com.algaworks.domain.response.ProdutoDTO;
import com.algaworks.repository.ItemPedidoRepository;
import com.algaworks.repository.PedidoRepository;
import com.algaworks.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ItemPedidoService {
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public void createItemPedido(ItemPedido itemPedido) {

        var itemPedidoNovo = new ItemPedido();

        itemPedidoNovo.setQuantidade(itemPedido.getQuantidade());
        itemPedidoNovo.setPreco(new BigDecimal(10));
        itemPedidoNovo.setPedidoId(itemPedido.getPedido().getId());
        itemPedidoNovo.setProdutoId(itemPedido.getProduto().getId());
        itemPedidoNovo.setPedido(itemPedido.getPedido());
        itemPedidoNovo.setProduto(itemPedido.getProduto());

        itemPedidoRepository.save(itemPedidoNovo);
        itemPedidoRepository.flush();
    }

    public ItemPedidoResponse buscaPorId(Long id) {
        ItemPedidoId itemPedidoId = new ItemPedidoId();
        itemPedidoId.setPedidoId(id);
        itemPedidoId.setProdutoId(id);
        Optional<ItemPedido> itemPedidoOptional = itemPedidoRepository.findById(itemPedidoId);

        ItemPedido itemPedido = itemPedidoOptional.get();

        var itemPedidoResponse = new ItemPedidoResponse();
        itemPedidoResponse.setPreco(itemPedido.getPreco());
        itemPedidoResponse.setQuantidade(itemPedido.getQuantidade());

        Pedido pedido = itemPedido.getPedido();
        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setDataInicio(pedido.getDataInicio());
        pedidoDTO.setDataConclucao(pedido.getDataConclucao());

        itemPedidoResponse.setPedidoDTO(pedidoDTO);

        Produto produto = itemPedido.getProduto();
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setPreco(produto.getPreco());
        produtoDTO.setNome(produto.getNome());

        itemPedidoResponse.setProdutoDTO(produtoDTO);

        return itemPedidoResponse;
    }
}