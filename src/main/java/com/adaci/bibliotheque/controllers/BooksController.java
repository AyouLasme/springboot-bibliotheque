package com.adaci.bibliotheque.controllers;

import com.adaci.bibliotheque.models.Books;
import com.adaci.bibliotheque.models.Librairies;
import com.adaci.bibliotheque.repository.BooksRepository;
import com.adaci.bibliotheque.repository.LibrairiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/books")
public class BooksController {
  @Autowired
  private BooksRepository booksRepository;

  @GetMapping("find")
  public List<Books> findAll() {
    return (List<Books>) booksRepository.findAll();

  }

  @GetMapping("/{id}")
  public ResponseEntity<Books> findById(@PathVariable(value = "id") long id) {
    Optional<Books> books = booksRepository.findById(id);

    if (books.isPresent()) {
      return ResponseEntity.ok().body(books.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
