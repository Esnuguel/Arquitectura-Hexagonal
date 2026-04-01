package com.esnuguel.inicio.common.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaginationResult<T> {

    private List<T> content;
    private int page;
    private int size;
    private int totalPages;
    private Long totalElements;
}
