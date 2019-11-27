package com.codegym.thimodule2;

import com.codegym.thimodule2.service.CategoryService;
import com.codegym.thimodule2.service.Impl.CategoryServiceImpl;
import com.codegym.thimodule2.service.Impl.ProductServiceImpl;
import com.codegym.thimodule2.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableWebMvc
public class Thimodule2Application {

    public static void main(String[] args) {
        SpringApplication.run(Thimodule2Application.class, args);
    }

    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }

    @Bean
    public CategoryService categoryService(){
        return new CategoryServiceImpl();
    }
}
