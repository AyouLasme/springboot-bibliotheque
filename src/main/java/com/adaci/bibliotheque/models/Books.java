package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "books")
public class Books implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String title;
  private String description;
  private String isbn;
  private int nombreDePage;
  private  String maisonEdition;
  private Date dateDeParution;
  private Date createdat;
  private Date updatedat;
}







