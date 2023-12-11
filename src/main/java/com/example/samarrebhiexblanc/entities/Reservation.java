package com.example.samarrebhiexblanc.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "reservation")
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation implements Serializable {
    @Id
    String idReservation;
    //@Column(TemporalType.DATE)
    LocalDate dateReservation;

    @Enumerated(EnumType.STRING)
    ClassPlace classPlace;
    @Enumerated(EnumType.STRING)
    EtatReservation etatReservation;

//@ManyToOne
  //  Vol vols;
//@ManyToOne
  //Voyageur voyageur;

}
