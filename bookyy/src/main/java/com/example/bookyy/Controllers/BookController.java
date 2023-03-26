package com.example.bookyy.Controllers;

import com.example.bookyy.Entites.Book;
import com.example.bookyy.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Book")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping()
    Book addbook(@RequestBody Book s) {
        bookService.add(s);
        return s;
    }
}
