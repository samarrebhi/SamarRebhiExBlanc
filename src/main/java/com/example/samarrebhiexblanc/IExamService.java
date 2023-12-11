package com.example.samarrebhiexblanc;

import com.example.samarrebhiexblanc.entities.ClassPlace;
import com.example.samarrebhiexblanc.entities.Reservation;
import com.example.samarrebhiexblanc.entities.Voyageur;

import java.util.List;
import java.util.Map;

public interface IExamService {
    List<Voyageur> ajouterVoyageurs(List<Voyageur>voyageurs);
    String reserverVol(Integer voyageurId, Integer volId, ClassPlace classPlace);
    Reservation confirmerReservation(String resId);
    Map<Integer,List<Voyageur>> getVoyageurByVol();
    void annulerReservation();

}
