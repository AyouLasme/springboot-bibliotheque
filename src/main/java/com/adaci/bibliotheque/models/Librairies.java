package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "librairies")
public class Librairies {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "library_id")
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

}


