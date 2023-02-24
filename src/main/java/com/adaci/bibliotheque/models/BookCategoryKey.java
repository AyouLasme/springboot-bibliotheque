package com.adaci.bibliotheque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BookCategoryKey implements Serializable {

  private static final long serialVersionUID = -7275079172834495736L;

  @Column(name="book_id")
  private Integer bookId;
  @Column(name="category_id")
  private Integer categoryId;
}
