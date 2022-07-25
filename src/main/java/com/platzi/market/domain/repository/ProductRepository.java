package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    //Aquí van los métodos que queremos que cualquier repositorio que vaya a trabajar con productos tenga que implementar.

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int ProductId);
    Product save(Product product);
    void delete(int productId);
}
