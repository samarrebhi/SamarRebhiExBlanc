package com.example.samarrebhiexblanc;

import com.example.samarrebhiexblanc.entities.Aeroport;
import com.example.samarrebhiexblanc.entities.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface VoyageurRepository extends JpaRepository<Voyageur, Integer> {
    Map<Integer,List<Voyageur>> findVoyageurByVol();

}
