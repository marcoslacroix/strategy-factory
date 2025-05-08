package com.example.strategy.factory.model;

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
