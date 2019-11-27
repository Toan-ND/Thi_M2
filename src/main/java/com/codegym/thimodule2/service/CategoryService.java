package com.codegym.thimodule2.service;

import com.codegym.thimodule2.model.Category;
import com.codegym.thimodule2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void delete(Long id);
}
