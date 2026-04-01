package com.esnuguel.inicio.product.application.command.create;

import org.springframework.web.multipart.MultipartFile;

import com.esnuguel.inicio.common.application.mediator.Request;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
public class CreateProductRequest implements Request<CreateProductResponse> {
    private String name;
    private String description;
    private Double price;
    private MultipartFile file;
}
