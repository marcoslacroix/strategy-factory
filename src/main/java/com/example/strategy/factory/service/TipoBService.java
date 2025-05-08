package com.example.strategy.factory.service;

import com.example.strategy.factory.model.Pedido;
import com.example.strategy.factory.strategy.PedidoStrategy;
import org.springframework.stereotype.Component;

@Component
public class TipoBService implements PedidoStrategy {

    @Override
    public String getTipo() {
        return "TIPO_B";
    }

    @Override
    public void salvar(Pedido lote) {
        System.out.println("Processando Pedido Tipo: " + getTipo());
    }
}
