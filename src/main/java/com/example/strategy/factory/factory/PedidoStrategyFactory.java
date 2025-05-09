package com.example.strategy.factory.factory;

import com.example.strategy.factory.model.Tipo;
import com.example.strategy.factory.strategy.PedidoStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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
        return Optional.ofNullable(strategies.get(tipo))
                .orElse(strategies.get(Tipo.DEFAULT.name()));
    }
}
