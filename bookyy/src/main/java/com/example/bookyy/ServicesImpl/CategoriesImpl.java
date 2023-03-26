package com.example.bookyy.ServicesImpl;

import com.example.bookyy.Entites.Categories;
import com.example.bookyy.Repository.CategoriesRepo;
import com.example.bookyy.Services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriesImpl implements CategoriesService {
    @Autowired
    CategoriesRepo repo;

    @Override
    public void add(Categories s) {
        repo.save(s);
    }

    @Override
    public Categories update(Categories s) {
        return null;
    }

    @Override
    public List<Categories> getAll() {
        return null;
    }

    @Override
    public Categories getById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
