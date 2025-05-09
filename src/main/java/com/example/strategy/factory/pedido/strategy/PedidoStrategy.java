package com.example.strategy.factory.pedido.strategy;


import com.example.strategy.factory.pedido.model.Pedido;

public interface PedidoStrategy {
    String getTipo();
    void salvar(Pedido pedido);
}
