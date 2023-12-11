package com.example.samarrebhiexblanc;

import com.example.samarrebhiexblanc.entities.ClassPlace;
import com.example.samarrebhiexblanc.entities.Reservation;
import com.example.samarrebhiexblanc.entities.Voyageur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExamService implements IExamService{
    @Autowired
    AeroportRepository ar;
    @Autowired
    ReservationRepository rr;
    @Autowired
    VolRepository volr;
    @Autowired
    VoyageurRepository voyr;

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyr.saveAll(voyageurs);
    }
    @Override
    public Map<Integer, List<Voyageur>> getVoyageurByVol() {
        return voyr.findVoyageurByVol();
    }
    @Override
    public String reserverVol(Integer voyageurId, Integer volId, ClassPlace classPlace) {
        return null;
    }

    @Override
    public Reservation confirmerReservation(String resId) {
        return null;
    }
/*
    @Override
    public Reservation confirmerReservation(String resId) {
        Reservation reserv=Voyageur.getr
        return rr.save(re);
    }*/



    @Override
    public void annulerReservation() {

    }


}
