package com.cgi.cinema.repositories;

import com.cgi.cinema.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket, Long>{


}
