package it.academy.java.sprint1.tasca7.n1exercisi1;

public class TreballadorPresencial extends Treballador {

    @Override
    public Double calcularSou(int hores, float km) {
        float preuKm = 1.75f;
        return hores * preuHora + (preuKm * km);
    }
}
