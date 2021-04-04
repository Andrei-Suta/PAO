package model;

import java.util.ArrayList;

public class Clinica {
    private DirectorClinica director;
    private String locatie;
    private ArrayList<Medic> componenta = new ArrayList<>();


    public Clinica(String locatie) {
        this.locatie = locatie;

    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public Medic getComponenta(int i) {
        return componenta.get(i);
    }

    public void setComponenta(ArrayList<Medic> componenta) {
        this.componenta = componenta;
    }

    public void adaugareMedic(Medic medic){
        this.componenta.add(medic);
    }

    public DirectorClinica getDirector() {
        return director;
    }

    public void setDirector(DirectorClinica director) {
        this.director = director;
    }

    public ArrayList<Medic> cautareSpecializare(String specializare){

        ArrayList<Medic> recomandari = new ArrayList<>();
        for(Medic medic : this.componenta){
            if(medic.getSpecializare().equals(specializare)){
                recomandari.add(medic);
            }
        }

        return recomandari;


    }

    @Override
    public String toString() {
        return this.locatie;
    }
}
