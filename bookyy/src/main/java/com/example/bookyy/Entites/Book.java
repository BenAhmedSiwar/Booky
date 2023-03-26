package com.example.bookyy.Entites;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int idbook;
    String name;
    String desccription;
    String image;
    Date publish_date;
    int page;
    @ManyToMany
    List<Categories>categoriesList;
}
