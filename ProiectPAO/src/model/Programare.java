package model;

public class Programare {
    private Medic medic;
    private Client client;
    private String data;
    private double ora;

    public Programare(Medic medic, Client client, String data, double ora) {
        this.medic = medic;
        this.client = client;
        this.data = data;
        this.ora = ora;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getOra() {
        return ora;
    }

    public void setOra(double ora) {
        this.ora = ora;
    }
}
