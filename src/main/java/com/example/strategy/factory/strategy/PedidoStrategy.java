package com.example.strategy.factory.strategy;


import com.example.strategy.factory.model.Pedido;

public interface PedidoStrategy {
    String getTipo();
    void salvar(Pedido pedido);
}
