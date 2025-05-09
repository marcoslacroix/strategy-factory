package com.example.strategy.factory.pedido.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private Tipo tipo;

    private String dados;

}
