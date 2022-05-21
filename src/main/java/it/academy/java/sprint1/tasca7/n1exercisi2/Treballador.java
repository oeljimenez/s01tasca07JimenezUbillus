package it.academy.java.sprint1.tasca7.n1exercisi2;

public class Treballador {
    protected String nom;
    protected String congnom;
    protected Double preuHora;

    public Double calcularSou(int hores) {
        return hores * preuHora;
    }

    public Double calcularSou(int hores,float km) {
        return null;
    }
}
