package com.example.strategy.factory.factory;

import com.example.strategy.factory.strategy.PedidoStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PedidoStrategyFactory {

    private final Map<String, PedidoStrategy> strategies;

    public PedidoStrategyFactory(List<PedidoStrategy> strategies) {
        this.strategies = strategies.stream()
                .collect(Collectors.toMap(PedidoStrategy::getTipo, Function.identity()));
    }

    public PedidoStrategy getStrategy(String tipo) {
        PedidoStrategy strategy = strategies.get(tipo);
        if (strategy == null) {
            throw new IllegalArgumentException("Tipo não suportado: " + tipo);
        }
        return strategy;
    }
}
