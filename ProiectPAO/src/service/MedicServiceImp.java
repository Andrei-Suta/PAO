package service;

import model.Medic;

import java.util.HashSet;
import java.util.Set;

public class MedicServiceImp implements MedicService{
    protected Set<Medic> medici= new HashSet<>();

    @Override
    public Set<Medic> getAll() {
        return medici;
    }

    @Override
    public Medic save(Medic obiect) {
        medici.add(obiect);
        return obiect;
    }

    @Override
    public void delete(Medic obiect) {
        medici.remove(obiect);
    }
}
