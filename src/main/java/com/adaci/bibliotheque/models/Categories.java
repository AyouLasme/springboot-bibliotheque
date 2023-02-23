package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Categories")
public class Categories implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String libelle;
	private Date createdat;
  private Date updatedat;
}
