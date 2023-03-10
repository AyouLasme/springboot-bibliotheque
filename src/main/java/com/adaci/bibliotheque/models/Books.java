package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "books")
public class Books implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @NotNull(message = "Le champ name est obligatoire")
  @NotBlank(message = "Le champ name ne peut etre vide")
  private String name;
  @NotNull(message = "Le champ title est obligatoire")
  @NotBlank(message = "Le champ title ne peut etre vide")
  private String title;
  private String description;

  @NotNull(message = "Le champ isbn est obligatoire")
  @NotBlank(message = "Le champ isbn ne peut etre vide")
  private String isbn;

  private int nombreDePage;
  private  String maisonEdition;
  private Date dateDeParution;

  private Date createdat;
  private Date updatedat;

  @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  private List<BookCategory> bookCategories;

  @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  private List<AuthorBook> authorBooks;
}







