package com.example.strategy.factory.pedido.controller;

import com.example.strategy.factory.pedido.factory.PedidoStrategyFactory;
import com.example.strategy.factory.pedido.model.Pedido;
import com.example.strategy.factory.pedido.model.Tipo;
import com.example.strategy.factory.pedido.strategy.PedidoStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoStrategyFactory factory;

    @GetMapping
    public ResponseEntity<?> get() {
        Pedido pedidoG = new Pedido(Tipo.TIPO_G, "Dados A");
        PedidoStrategy strategy = factory.getStrategy(pedidoG.getTipo().name());
        strategy.salvar(pedidoG);
        return ResponseEntity.ok().build();
    }

}
