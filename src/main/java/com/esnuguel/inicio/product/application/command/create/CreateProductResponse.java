package com.esnuguel.inicio.product.application.command.create;

import com.esnuguel.inicio.common.application.mediator.Request;
import com.esnuguel.inicio.product.domain.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateProductResponse {
    private Product product;
}
