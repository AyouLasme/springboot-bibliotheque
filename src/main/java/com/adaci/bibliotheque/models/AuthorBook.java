package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "author_book")
@Data
public class AuthorBook {
  @EmbeddedId
  private AuthorBookKey id;

  @ManyToOne()
  @MapsId("authorId")
  @JoinColumn(name="author_id")
  private Authors author;


  @ManyToOne()
  @MapsId("bookId")
  @JoinColumn(name="book_id")
  private Books book;


  private Date createdAt;
  private Date updatedAt;

  private String version;
}
