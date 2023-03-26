package com.example.bookyy.Services;

import com.example.bookyy.Entites.Book;

import java.util.List;

public interface BookService {
    void add(Book s);
    Book update(Book s);
    List<Book> getAll();
    Book getById(int id);
    void remove(int id);



}
