package com.example.strategy.factory.pedido.service;

import com.example.strategy.factory.pedido.model.Pedido;
import com.example.strategy.factory.pedido.model.Tipo;
import com.example.strategy.factory.pedido.strategy.PedidoStrategy;
import org.springframework.stereotype.Component;

@Component
public class TipoDefaultService implements PedidoStrategy {

    @Override
    public String getTipo() {
        return Tipo.DEFAULT.name();
    }

    @Override
    public void salvar(Pedido lote) {
        System.out.println("Processando Pedido DEFAULT: " + getTipo());
    }
}