package com.adaci.bibliotheque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "authors")
public class Authors {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String fullname ;
  private String address;
  private String phone;
  private String email;
	private char gender;
	private Date createdat;
  private Date updatedat;

  @OneToMany(mappedBy = "author",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  private List<AuthorBook> authorBooks;

}
