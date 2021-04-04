import model.*;
import service.MedicService;
import service.MedicServiceImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Medic> listaMedici = new ArrayList<>();
        Set<Client> listaClienti = new HashSet<>();
        ArrayList<Clinica> clinici = new ArrayList<>();
        Set<Rezident> rezidenti = new HashSet<>();

        //sunt create clinicile
        Clinica DrumulTaberei = new Clinica("Strada Drumul Taberei nr. 107");
        Clinica Berceni = new Clinica("Soseaua Berceni nr.12");
        Clinica Unirii = new Clinica("Splaiul Unirii nr 220");
        clinici.add(DrumulTaberei);
        clinici.add(Berceni);
        clinici.add(Unirii);

        //directorii fiecarei clinici
        DirectorClinica PopescuMugurel = new DirectorClinica("Popescu Mugurel", 1, "Endocrinologie", 'M', 35, DrumulTaberei, 2013);
        DrumulTaberei.setDirector(PopescuMugurel);

        DirectorClinica SoareMaria = new DirectorClinica("Soare Maria", 2, "Oftalmologie", 'F', 45, Berceni, 2002);
        Berceni.setDirector(SoareMaria);

        DirectorClinica RaduAnastasia = new DirectorClinica("Radu Anastasia", 3, "Cardiologie", 'F', 37, Unirii, 2008);
        Unirii.setDirector(RaduAnastasia);

        //adaugam medici fiecarei clinici
        Medic IonescuRazvan = new Medic("Ionescu Razvan", 1, "Pediatrie", 'M', 12, DrumulTaberei);
        listaMedici.add(IonescuRazvan);
        Medic IancuVasile = new Medic("Iancu Vasile", 2, "Oftalmologie", 'M', 10, DrumulTaberei);
        listaMedici.add(IancuVasile);
        Medic PopescuMaria = new Medic("Popescu Maria", 3, "Ginecologie", 'F', 5, Berceni);
        listaMedici.add(PopescuMaria);
        Medic MarinAndrei = new Medic("Marin Andrei", 4, "Cardiologie", 'M', 22, Unirii);
        listaMedici.add(MarinAndrei);


        //adaugam medicii in lista corespunzatoare clinicii la care lucreaza
        DrumulTaberei.adaugareMedic(IonescuRazvan);
        DrumulTaberei.adaugareMedic(IancuVasile);
        Berceni.adaugareMedic(PopescuMaria);
        Unirii.adaugareMedic(MarinAndrei);



        Client StefanAndrei = new Client("Stefan Andrei", 1, 16, 'M', "Endocrinologie");
        listaClienti.add(StefanAndrei);
        Client VaduvaMaria = new Client("Vaduva Maria", 2, 22, 'F', "Ginecologie");
        listaClienti.add(VaduvaMaria);
        Client OpreaVasile = new Client("Oprea Vasile", 3, 67, 'M', "Cardiologie");
        listaClienti.add(OpreaVasile);
        Client MarinescuAlina = new Client("Marinescu Alina", 4, 42, 'F', "Oftalmologie");
        listaClienti.add(MarinescuAlina);


        Rezident LucianIoana = new Rezident("Lucian Ioana", 1, "Pediatrie", 'F', DrumulTaberei, 1);
        rezidenti.add(LucianIoana);
        Rezident TomaIon = new Rezident("Toma Ion", 2, "Stomatologie", 'M', Berceni, 2);
        rezidenti.add(TomaIon);

        System.out.println("Medici:\n");
        for(int i = 0; i < listaMedici.size() - 1; i++){
            for(int j = i + 1; j < listaMedici.size(); j++ ){
                if(listaMedici.get(i).getAniExperienta() < listaMedici.get(j).getAniExperienta()){
                    Collections.swap(listaMedici, i, j);
                }
            }
        }
        for(Medic medic : listaMedici){
            System.out.println(medic);
        }

        System.out.println("\n");
        System.out.println("Clienti:");
        System.out.println("\n");

        for(Client client : listaClienti){
            System.out.println(client.getNume() + "  ID:" + client.getId() + "  Varsta:" + client.getVarsta() + "  Sex:" + client.getSex() + "  NevoieSpecializare:" + client.getNevoieSpecializare());
        }

        MedicService medicService = new MedicServiceImp();
        medicService.save(MarinAndrei);
        medicService.save(IancuVasile);
        medicService.save(IonescuRazvan);
        medicService.save(PopescuMaria);

        medicService.delete(MarinAndrei);

        System.out.println(medicService.getAll());

    }
}
