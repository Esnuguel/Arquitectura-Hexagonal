package com.esnuguel.inicio.product.infrestructure.database.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esnuguel.inicio.product.infrestructure.database.entity.ProductEntity;

@Repository
public interface QueryProductRepository extends JpaRepository<ProductEntity,Long> {
    Optional<ProductEntity> findByNameContaining(String name);
    List<ProductEntity> findAllByPriceIsBetween(Double priceAfter, Double priceBefore);

    @Query("""
            SELECT p 
            FROM ProductEntity p 
            WHERE p.name LIKE concat('%',:name,'%') 
            OR p.description LIKE concat('%',:description,'%')  
            OR p.price BETWEEN :priceAfter AND :priceBefore
        """)
    List<ProductEntity> prueba(String name,String description, Double priceAfter, Double priceBefore);

    boolean existsByName(String name);

    //Paginacion
    Page<ProductEntity> findAll(Pageable pageable);

}
