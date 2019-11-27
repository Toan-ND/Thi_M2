package com.codegym.thimodule2.repository;

import com.codegym.thimodule2.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
