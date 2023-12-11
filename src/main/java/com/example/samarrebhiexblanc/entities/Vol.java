package com.example.samarrebhiexblanc.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Table(name = "vol")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idVol;
    LocalDate DateDepart;
    LocalDate DateArrive;

   // @OneToMany(cascade =CascadeType.ALL,mappedBy = "resevations")
    //private Set<Reservation> Reservationset;


}
