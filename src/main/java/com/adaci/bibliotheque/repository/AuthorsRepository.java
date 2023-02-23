package com.adaci.bibliotheque.repository;

import com.adaci.bibliotheque.models.Authors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuthorsRepository extends CrudRepository<Authors, Long> {

}
