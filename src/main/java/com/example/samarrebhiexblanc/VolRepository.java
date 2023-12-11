package com.example.samarrebhiexblanc;

import com.example.samarrebhiexblanc.entities.Aeroport;
import com.example.samarrebhiexblanc.entities.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface VolRepository extends JpaRepository<Vol, Integer> {

}
