package com.esnuguel.inicio.product.application.query.getAll;

import com.esnuguel.inicio.common.application.mediator.Request;
import com.esnuguel.inicio.common.domain.PaginationQuery;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetAllProductRequest implements Request<GetAllProductResponse>{
    PaginationQuery paginationQuery;
}