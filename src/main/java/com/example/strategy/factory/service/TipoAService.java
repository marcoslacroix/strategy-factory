package com.example.strategy.factory.service;

import com.example.strategy.factory.model.Pedido;
import com.example.strategy.factory.strategy.PedidoStrategy;
import org.springframework.stereotype.Component;

@Component
public class TipoAService implements PedidoStrategy {

    @Override
    public String getTipo() {
        return "TIPO_A";
    }

    @Override
    public void salvar(Pedido lote) {
        System.out.println("Processando Lote Tipo: " + getTipo());
    }
}
