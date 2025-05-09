package com.example.strategy.factory.service;

import com.example.strategy.factory.model.Pedido;
import com.example.strategy.factory.model.Tipo;
import com.example.strategy.factory.strategy.PedidoStrategy;
import org.springframework.stereotype.Component;

@Component
public class TipoCService implements PedidoStrategy {

    @Override
    public String getTipo() {
        return Tipo.TIPO_C.name();
    }

    @Override
    public void salvar(Pedido lote) {
        System.out.println("Processando Pedido Tipo: " + getTipo());
    }
}