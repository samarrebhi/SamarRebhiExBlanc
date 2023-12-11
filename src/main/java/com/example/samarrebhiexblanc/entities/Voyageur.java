package com.example.samarrebhiexblanc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Table(name = "voyageur")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Voyageur implements Serializable {
    @Id
    @Column(name = "id_voyageur")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idVoyageur;
    @Column(name = "nom")
    String nom;
    @Column(name = "prenom")
    String prenom;

    @Column(name = "date_naissance")
    LocalDate dateNaissance;

    /*@OneToMany(cascade =CascadeType.ALL,mappedBy = "resevations")
    //private Set<Reservation> Reservationset;*/
}
