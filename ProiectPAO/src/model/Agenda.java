package model;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Programare> agenda = new HashSet<>();

    public void setAgenda(Set<Programare> agenda) {
        this.agenda = agenda;
    }

    public Agenda(Set<Programare> agenda) {
        this.agenda = agenda;
    }

    public Set<Programare> getAgenda() {
        return agenda;
    }

    @Override
    public String toString() {
        return "model.Agenda{" +
                "agenda=" + agenda +
                '}';
    }
}
