package com.cgi.cinema.serviceimpl;

import com.cgi.cinema.entities.*;
import com.cgi.cinema.repositories.*;
import com.cgi.cinema.services.CinemaAppInitializerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

@Service
public class CinemaAppInitializerServiceImpl implements CinemaAppInitializerService {

    @Autowired
    private VilleRepository villeRepository;
    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private SalleRepository salleRepository;
    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private SeanceRepository seanceRepository;
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private ProjectionRepository projectionRepository;
    @Autowired
    private CategorieRepository categorieRepository;
    @Override
    public void initVilles() {
        Stream.of("Lyon", "Paris", "Toulouze").forEach(nameVille->{
            Ville ville = new Ville();
            ville.setName(nameVille);
            villeRepository.save(ville);}
            );
    }

    @Override
    public void initCinemas() {
        villeRepository.findAll().forEach(v->{
            Stream.of("C1", "C2", "C3", "C4")
                    .forEach(nameCinema-> {
                        Cinema cinema = new Cinema();
                        cinema.setName(nameCinema);
                        cinema.setNombreSalles(3+ (int)(Math.random()*7));
                        cinema.setVille(v);
                        cinemaRepository.save(cinema);
                    });
        });

    }

    @Override
    public void initSalles() {
        cinemaRepository.findAll().forEach(cinema->{
            for(int i = 0; i < cinema.getNombreSalles(); i++) {
                Salle salle= new Salle();
                salle.setName("Salle "+(i+1));
                salle.setCinema(cinema);
                salle.setNombrePlaces(15 + (int) (Math.random()*20));
                salleRepository.save(salle);
            }
        });
    }

    @Override
    public void initPlaces() {
salleRepository.findAll().forEach(salle -> {
    for (int i = 0; i < salle.getNombrePlaces(); i++) {
        Place place = new Place();
        place.setNumero(i+1);
        place.setSalle(salle);
        placeRepository.save(place);
    }
});
    }

    @Override
    public void initSeances() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Stream.of("12:00","15:00","17:00","19:00","10:00")
        .forEach(s-> {
            Seance seance = new Seance();
            try {
                seance.setHeureDebut(dateFormat.parse(s));
            } catch (ParseException e) {
                e.printStackTrace();
            }

        });
    }

    @Override
    public void initCategories() {

    }

    @Override
    public void initFilms() {

    }

    @Override
    public void initProjections() {

    }

    @Override
    public void initTickets() {

    }
}
