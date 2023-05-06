package com.example.bookyy.ServicesImpl;

import com.example.bookyy.Entites.Book;
import com.example.bookyy.Entites.Categories;
import com.example.bookyy.Entites.Rating;
import com.example.bookyy.Repository.BookRepo;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookImpl  {

   final private BookRepo repo;

    public BookImpl(BookRepo repo) {
        this.repo = repo;
    }


    public Book add(Book s) {
        return repo.save(s);
    }


    public Book update(Book s) {
        return repo.save(s);
    }


    public List<Book> getAll() {
        return repo.findAll();
    }


    public Book getBybookId(int id) {
        return repo.findById(id).orElse(null);
    }


    public void remove(int id) {
                repo.deleteById(id);
    }
    public  List<Book> getbycat(Categories cat){
       return repo.findBookparcategories(cat);
    }


   public double avgRatingOfBook(int idbook){
        double rate=0.0;
        try {
            rate = repo.avgRateOfBook(idbook);
        }catch(Exception e)
        {
        }
        return rate;
    }

   public List<Book> sortBookByRate(){
       List<Book> books = getAll();
       System.out.println("all books:"+books);
       List<Book> sortBook = books.stream().sorted((book1,book2)->(avgRatingOfBook(book1.getIdbook())<avgRatingOfBook(book2.getIdbook()))?1:(avgRatingOfBook(book1.getIdbook())>avgRatingOfBook(book2.getIdbook()))?-1:0).collect(Collectors.toList());
       System.out.println("After sorting:"+sortBook);
       return sortBook;
   }

   }