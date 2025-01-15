package org.example.repo;

import org.example.model.Spieler;

import java.util.ArrayList;
import java.util.List;

public class SpielerRepository {

    private List<Spieler> spielers = new ArrayList<Spieler>();

    public Spieler read(String name) {
        for(Spieler spieler : spielers) {
            if(spieler.getName().equals(name)) {
                return spieler;
            }
        }
        return null;
    }

    public void create(Spieler spieler) {
        spielers.add(spieler);
    }

    public void update(Spieler spieler) {
        for(int i = 0; i < spielers.size(); i++) {
            if(spielers.get(i).getName().equals(spieler.getName())) {
                spielers.set(i, spieler);
            }
        }
    }

    public void delete(String name) {

        spielers.removeIf(s -> s.getName().equals(name));
    }

    public List<Spieler> getAll(){
        return spielers;
    }
}
