package com.InventoryManagementApplication.product.repository;

import com.InventoryManagementApplication.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
