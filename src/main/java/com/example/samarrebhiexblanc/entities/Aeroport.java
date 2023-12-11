package com.example.samarrebhiexblanc.entities;

import com.example.samarrebhiexblanc.entities.Vol;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Table(name = "aeroport")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Aeroport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idAeroport;

    @Column(nullable = false)
    String nom;

    @Column(length = 3)
    String CodeAITA;

    Long telephone;


    //@OneToMany(cascade = CascadeType.ALL)
    //private Set<Vol> volSet;

}
