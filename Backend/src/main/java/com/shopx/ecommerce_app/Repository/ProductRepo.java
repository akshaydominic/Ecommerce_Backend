package com.shopx.ecommerce_app.Repository;

import com.shopx.ecommerce_app.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("http://localhost:4200")
public interface ProductRepo extends JpaRepository<Product,Long>{
    
}