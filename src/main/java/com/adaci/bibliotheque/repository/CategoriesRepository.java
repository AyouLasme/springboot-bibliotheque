package com.adaci.bibliotheque.repository;

import com.adaci.bibliotheque.models.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long> {
}
