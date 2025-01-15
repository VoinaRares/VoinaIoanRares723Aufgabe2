package org.example.repo;

import org.example.model.Spieler;
import org.example.model.Verein;

import java.util.ArrayList;
import java.util.List;

public class VereinRepository {
    private List<Verein> vereins = new ArrayList<Verein>();

    public Verein read(int id) {
        for(Verein v : vereins) {
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public void create(Verein verein) {
        vereins.add(verein);
    }

    public void update(Verein verein) {
        for(int i = 0; i < vereins.size(); i++) {
            if(vereins.get(i).getId() == verein.getId()) {
                vereins.set(i, verein);
            }
        }
    }

    public void delete(int id) {

        vereins.removeIf(s -> s.getId() == id);
    }

    public List<Verein> getAll(){
        return vereins;
    }

}
