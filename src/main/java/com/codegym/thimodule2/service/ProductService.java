package com.codegym.thimodule2.service;

import com.codegym.thimodule2.model.Category;
import com.codegym.thimodule2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Iterable<Product> findAll(Pageable pageable);

    Product findById(Long id);

    void save(Product product);

    void delete(Long id);

    Iterable<Product> findAllByCategory(Category category);

    Page<Product> findAllByNameContaining(String name, Pageable pageable);
}
