package com.cgi.cinema.repositories;

import com.cgi.cinema.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface PlaceRepository extends JpaRepository<Place, Long>{


}
