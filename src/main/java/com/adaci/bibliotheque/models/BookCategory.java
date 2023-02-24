package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book_category")
@Data
public class BookCategory implements Serializable {

  private static final long serialVersionUID = -4612504723628291981L;

  @EmbeddedId
  private BookCategoryKey id;

  @ManyToOne()
  @MapsId("categoryId")
  @JoinColumn(name="category_id")
  private Categories category;


  @ManyToOne()
  @MapsId("bookId")
  @JoinColumn(name="book_id")
  private Books book;


  private Date createdAt;
  private Date updatedAt;
}
