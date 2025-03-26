package com.example.eshop.backend.api.repository;



import com.example.eshop.backend.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}