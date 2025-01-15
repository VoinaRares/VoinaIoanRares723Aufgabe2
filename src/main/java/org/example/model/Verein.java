package org.example.model;

import java.util.List;

public class Verein {
    private int id;
    private String name;
    private String stadt;
    private List<Spieler> spielerList;

    public Verein(int id, String name, String stadt, List<Spieler> spielerList) {
        this.id = id;
        this.name = name;
        this.stadt = stadt;
        this.spielerList = spielerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public List<Spieler> getSpielerList() {
        return spielerList;
    }

    public void setSpielerList(List<Spieler> spielerList) {
        this.spielerList = spielerList;
    }
}
