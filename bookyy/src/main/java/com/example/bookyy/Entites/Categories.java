package com.example.bookyy.Entites;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryid;

    @Enumerated(EnumType.STRING)
    Genrebook genrebook;

    @Enumerated(EnumType.STRING)
    LangueBook langueBook;
@ManyToMany
    List<Book>bookList;
}
