package com.example.bookyy.ServicesImpl;

import com.example.bookyy.Entites.Book;
import com.example.bookyy.Repository.BookRepo;
import com.example.bookyy.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookImpl implements BookService {
    @Autowired
   private BookRepo repo;

    @Override
    public void add(Book s) {
        repo.save(s);
    }

    @Override
    public Book update(Book s) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
