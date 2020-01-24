package com.cgi.cinema.repositories;

import com.cgi.cinema.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource

public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
