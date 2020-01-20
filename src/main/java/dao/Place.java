package dao;

import javax.persistence.*;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private double longitude, latitude, altitude;
    @ManyToOne
    private Salle salle;

}
