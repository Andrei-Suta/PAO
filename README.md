# PAO
Am ales programare cabinet medical ca tema pentru proiectul meu. Am implementat Crud service ca interfata, interfata care va fi extinsa ulterior de cate o interfata service pentru toate entitatile(momentan am imlementat doar MedicService, apoi am creat clasa MedicServiceImp).
Aceasta interfata Crud service permite adaugarea obiectelor, stergerea lor, precum si metoda getAll(), aceasta din urma functionand precum un SELECT * FROM x, unde x reprezinta un model. Aceste actiuni vor fi implementate pentru toate modelele din package-ul model(Agenda, Client, Clinica, DirectorClinica, Medic, Programare, Rezident).
Momentan, am mai creat doua colectii de tip Set si doua colectii de tip ArrayList care stocheaza obiectele create, dintre acestea ArrayList-ul care stocheaza medicii este sortat in functie de anii de experienta ai fiecarui medic(ordinea este descrescatoare, primul medic afisat fiind cel mai experimentat).
In cadrul clasei Clinica, am implementat o metoda ce permite  cautarea medicilor dintr-o clinica in functie de specializare(de exemplu, cazul in care un pacient nu se poate misca pana la o clinica mai indepartata si doreste a alege mai intai clinica, dupa care medicul).

---
```
        Clinica Berceni = new Clinica("Soseaua Berceni nr.12");
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
        Berceni.adaugareMedic(IonescuRazvan);
        Berceni.adaugareMedic(IancuVasile);
        Berceni.adaugareMedic(PopescuMaria);
        Berceni.adaugareMedic(MarinAndrei);
        
        ArrayList<Medic> x = new ArrayList<>();
        x = Berceni.cautareSpecializare("Oftalmologie");
        //x va contine toti medicii cu specializarea respectiva din cadrul clinicii selectate, adica x va contine in acest caz toti oftalmologii clinicii din Berceni
       
```
---
Fiecare Medic are o agenda- aceasta reprezinta lista programarilor, implementata printr-un hashmap in care avem ca si cheie medicul respectiv, iar ca valoare avem un alt hashmap data si ora programarilor medicului respectiv. Astfel vom putea cauta intervalele orare libere dintro anumita zi, atunci cand user-ul va dori sa isi faca o programare la un anumit medic.
