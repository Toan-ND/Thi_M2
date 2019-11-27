package com.codegym.thimodule2.repository;

import com.codegym.thimodule2.model.Category;
import com.codegym.thimodule2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    Iterable<Product> findAllByCategory(Category category);

    Page<Product>findAllByNameContaining(String name, Pageable pageable);
}
