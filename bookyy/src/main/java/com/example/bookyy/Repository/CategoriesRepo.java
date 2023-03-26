package com.example.bookyy.Repository;

import com.example.bookyy.Entites.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepo extends JpaRepository<Categories,Integer> {
}
