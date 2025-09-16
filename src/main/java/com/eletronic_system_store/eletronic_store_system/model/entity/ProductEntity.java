package com.eletronic_system_store.eletronic_store_system.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false, length = 100)
    private String name;

    @Column(name = "product_description", length = 500)
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "product_quantity", nullable = false)
    private int quantity;

    @Column(name = "product_category", nullable = false)
    private ProductCategory category;

    @Column(name = "supplier", nullable = false)
    private SupplierEntity supplier;

    public ProductEntity(String name, String description, double price, int quantity, ProductCategory category, SupplierEntity supplier) {
        setName(name);
        setDescription(description);
        setPrice(price);
        setQuantity(quantity);
        setCategory(category);
        setSupplier(supplier);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public ProductCategory getCategory() {
        return category;
    }

    public SupplierEntity getSupplier() {
        return supplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setSupplier(SupplierEntity supplier) {
        this.supplier = supplier;
    }

    public ProductEntity() {}
}
