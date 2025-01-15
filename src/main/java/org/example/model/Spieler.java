package org.example.model;

public class Spieler {
    private String name;
    private int alter;
    private String position;
    private int Marktvert;

    public Spieler(String name, int alter, String position, int marktvert) {
        this.name = name;
        this.alter = alter;
        this.position = position;
        Marktvert = marktvert;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", position='" + position + '\'' +
                ", Marktvert=" + Marktvert +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMarktvert() {
        return Marktvert;
    }

    public void setMarktvert(int marktvert) {
        Marktvert = marktvert;
    }
}
