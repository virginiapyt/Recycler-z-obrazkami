package pl.tomczyk.recyclerviewv2;

public class Liczby {

    private  int idObrazka;
    private String name;

    public Liczby(int idObrazka, String name) {
        this.idObrazka = idObrazka;
        this.name = name;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
