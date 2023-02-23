package com.adaci.bibliotheque.controllers;

import com.adaci.bibliotheque.models.Books;
import com.adaci.bibliotheque.models.Librairies;
import com.adaci.bibliotheque.repository.BooksRepository;
import com.adaci.bibliotheque.repository.LibrairiesRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/api/books")
public class BooksController {
  @Autowired
  private BooksRepository booksRepository;

  @GetMapping()
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

  @PostMapping()
  public ResponseEntity<Books> save(@Validated @RequestBody Books books) {

    return new ResponseEntity<>(booksRepository.save(books), HttpStatus.CREATED);
  }

  @DeleteMapping()
  public ResponseEntity<Books> update(@Validated @RequestBody Books books){
    return new ResponseEntity<>(booksRepository.save(books), HttpStatus.CREATED);
  }

  @PutMapping()
  public void delete(@Validated @RequestBody Books books){
    booksRepository.deleteById(books.getId());
  }
}
