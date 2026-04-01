package com.esnuguel.inicio.product.application.command.create;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.esnuguel.inicio.common.application.mediator.RequestHandler;
import com.esnuguel.inicio.common.infrastructure.util.FileUtils;
import com.esnuguel.inicio.product.domain.entity.Product;
import com.esnuguel.inicio.product.domain.port.ProductoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateProductHandler implements RequestHandler<CreateProductRequest,CreateProductResponse>{

    private final ProductoRepository productRepository;    
    private final FileUtils fileUtils;
    
    @Override
    public Class<CreateProductRequest> getRequestType() {
        return CreateProductRequest.class;
    }

    @Override
    public CreateProductResponse handle(CreateProductRequest request) {
        String uniqueFileName=fileUtils.saveProductImage(request.getFile());
        
        Product product= Product.builder()
            .description(request.getDescription())
            .name(request.getName())
            .price(request.getPrice())
            .image(uniqueFileName)
            .build();
        Product storedProduct=productRepository.uppsert(product);
        log.info("Proucto creado con el id: "+storedProduct.getId());
    
        return new CreateProductResponse(storedProduct);
    }
    
}
