package com.adaci.bibliotheque.repository;

import com.adaci.bibliotheque.models.Librairies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrairiesRepository extends CrudRepository<Librairies, Long>{

}


