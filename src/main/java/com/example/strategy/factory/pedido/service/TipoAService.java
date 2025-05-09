package com.example.strategy.factory.pedido.service;

import com.example.strategy.factory.pedido.model.Pedido;
import com.example.strategy.factory.pedido.model.Tipo;
import com.example.strategy.factory.pedido.strategy.PedidoStrategy;
import org.springframework.stereotype.Component;

@Component
public class TipoAService implements PedidoStrategy {

    @Override
    public String getTipo() {
        return Tipo.TIPO_A.name();
    }

    @Override
    public void salvar(Pedido lote) {
        System.out.println("Processando Pedido Tipo: " + getTipo());
    }
}
