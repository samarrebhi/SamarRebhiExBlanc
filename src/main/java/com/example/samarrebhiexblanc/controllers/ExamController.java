package com.example.samarrebhiexblanc.controllers;

import com.example.samarrebhiexblanc.ExamService;
import com.example.samarrebhiexblanc.entities.Voyageur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/exblanc")
public class ExamController {
@Autowired
    ExamService service;

@PostMapping("/addallvoyageurs")
public List<Voyageur>  ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs){return service.ajouterVoyageurs(voyageurs);}
@GetMapping("/getvoyageursbyvol")
    public Map<Integer, List<Voyageur>> getVoyageurByVol(@RequestParam ("idvol") Integer idvol)
{
    return service.getVoyageurByVol();
}
}
