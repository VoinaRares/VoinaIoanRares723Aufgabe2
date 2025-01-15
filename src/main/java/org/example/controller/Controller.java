package org.example.controller;

import org.example.model.Spieler;
import org.example.model.Verein;
import org.example.repo.SpielerRepository;
import org.example.repo.VereinRepository;

import java.util.List;

public class Controller {

    private SpielerRepository spielerRepository = new SpielerRepository();
    private VereinRepository vereinRepository = new VereinRepository();

    public List<Verein> filterByCity(String city) {
        return vereinRepository.getAll().stream().filter( v -> v.getStadt().equals(city)).toList();
    }

    public List<Spieler> filterByVerein(String name) {
        List<Verein> vereins = vereinRepository.getAll();
        for(Verein verein : vereins) {
            if(verein.getName().equals(name)) {
                return verein.getSpielerList();
            }
        }
        return List.of();
    }

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

    public List<Verein> getAllVereins(){
        return vereinRepository.getAll();
    }

    public Verein readVerein(int id){
        return vereinRepository.read(id);
    }

    public void createVerein(Verein verein){
        vereinRepository.create(verein);
    }

    public void updateVerein(Verein verein){
        vereinRepository.update(verein);
    }

    public void deleteVerein(int id){
        vereinRepository.delete(id);
    }
}
