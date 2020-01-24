package com.cgi.cinema.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.cgi.cinema.entities.Cinema;
@Repository
@RepositoryRestResource

public interface CinemaRepository extends JpaRepository<Cinema, Long>{

}
