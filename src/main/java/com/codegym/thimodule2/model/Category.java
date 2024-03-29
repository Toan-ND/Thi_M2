package com.codegym.thimodule2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categorys")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(targetEntity = Product.class)
    private Set<Product> products;

    public Category() {
    }

    public Category(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
