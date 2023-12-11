package com.example.samarrebhiexblanc;

import com.example.samarrebhiexblanc.entities.Aeroport;
import com.example.samarrebhiexblanc.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
