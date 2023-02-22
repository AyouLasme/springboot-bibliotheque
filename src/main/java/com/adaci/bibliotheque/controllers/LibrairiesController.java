package com.adaci.bibliotheque.controllers;

import com.adaci.bibliotheque.models.Librairies;
import com.adaci.bibliotheque.repository.LibrairiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/librairies")
public class LibrairiesController {
  @Autowired
  private LibrairiesRepository librairiesRepository;

  @GetMapping("find")
  public List<Librairies> findAll() {
    return (List<Librairies>) librairiesRepository.findAll();

  }

  @GetMapping("/{id}")
  public ResponseEntity<Librairies> findById(@PathVariable(value = "id") long id) {
    Optional<Librairies> librairies = librairiesRepository.findById(id);

    if(librairies.isPresent()) {
      return ResponseEntity.ok().body(librairies.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public Librairies save(@Validated @RequestBody Librairies librairies) {
    return librairiesRepository.save(librairies);
  }
}


