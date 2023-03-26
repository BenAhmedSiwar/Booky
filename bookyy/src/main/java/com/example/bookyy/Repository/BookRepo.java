package com.example.bookyy.Repository;

import com.example.bookyy.Entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository <Book,Integer> {

}
