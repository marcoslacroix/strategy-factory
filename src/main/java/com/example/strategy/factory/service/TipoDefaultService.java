package com.example.strategy.factory.service;

import com.example.strategy.factory.model.Pedido;
import com.example.strategy.factory.model.Tipo;
import com.example.strategy.factory.strategy.PedidoStrategy;
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