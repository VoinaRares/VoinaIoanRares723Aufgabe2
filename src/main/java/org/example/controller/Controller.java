package org.example.controller;

import org.example.model.Spieler;
import org.example.repo.SpielerRepository;

import java.util.List;

public class Controller {

    private SpielerRepository spielerRepository = new SpielerRepository();

    public Spieler readSpieler(String name){
        return spielerRepository.read(name);
    }

    public void createSpieler(Spieler spieler){
        spielerRepository.create(spieler);
    }

    public void updateSpieler(Spieler spieler){
        spielerRepository.update(spieler);
    }

    public void deleteSpieler(String name){
        spielerRepository.delete(name);
    }

    public List<Spieler> getAllSpielers(){
        return spielerRepository.getAll();
    }
}
