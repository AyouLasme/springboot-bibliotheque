package com.adaci.bibliotheque.controllers;

import com.adaci.bibliotheque.models.Categories;
import com.adaci.bibliotheque.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.*;
@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
  @Autowired
  private CategoriesRepository categoriesRepository;

  @GetMapping()
  public List<Categories> findAll() {
    return (List<Categories>) categoriesRepository.findAll();

  }

  @GetMapping("/{id}")
  public ResponseEntity<Categories> findByIds(@PathVariable(value = "id") long id) {
    Optional<Categories> categories = categoriesRepository.findById(id);

    if(categories.isPresent()) {
      return ResponseEntity.ok().body(categories.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping()
  public Categories save(@Validated @RequestBody Categories categories) {
    return categoriesRepository.save(categories);
  }
}
