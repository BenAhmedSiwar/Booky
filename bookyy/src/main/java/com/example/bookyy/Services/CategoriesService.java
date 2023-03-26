package com.example.bookyy.Services;

import com.example.bookyy.Entites.Book;
import com.example.bookyy.Entites.Categories;

import java.util.List;

public interface CategoriesService {
    void add(Categories s);
    Categories update(Categories s);
    List<Categories> getAll();
    Categories getById(int id);
    void remove(int id);

}
