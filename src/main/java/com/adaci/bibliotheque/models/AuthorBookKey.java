package com.adaci.bibliotheque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AuthorBookKey {
  @Column(name = "author_id")
  private int authorId;
  @Column(name = "book_id")
  private int bookId;
}
