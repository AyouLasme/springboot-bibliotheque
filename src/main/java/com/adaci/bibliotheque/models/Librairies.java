package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "librairies")
public class Librairies implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private long id;
  private String name;
  private String address;
  private String phone;
  private String email;
  private String gestionnaire;
  private Date openAt;
  private Date closeAt;
  private Date createdat;
  private Date updatedat;

  /*jointure unidirectionnelle de  la classe libraries avec  la classe books
    une librairies comportes un ou plusieurs livres*/
  @OneToMany(targetEntity = Books.class, cascade = CascadeType.ALL)
  @JoinColumn (name = "libraries_fk",referencedColumnName = "id")
  private List<Books> books;

    /*jointure unidirectionnelle de  la classe libraries avec  la classe Categories
    une librairies comportes un ou plusieurs categories*/

  @OneToMany(targetEntity = Categories.class, cascade = CascadeType.ALL)
  @JoinColumn (name = "libraries_fk",referencedColumnName = "id")
  private List<Categories> categories;


}




