package it.academy.java.sprint1.tasca7.n1exercisi1;

public class TreballadorOnline extends Treballador {

    @Override
    public Double calcularSou(int hores) {
        float internet = 40;
        return (hores * preuHora) + internet;
    }
}
