package it.academy.java.sprint1.tasca7.n1exercisi2;

public class TreballadorOnline extends Treballador {

    @Override
    public Double calcularSou(int hores) {
        float internet = 40;
        return (hores * preuHora) + internet;
    }

    @Deprecated
    public void setBaseprice(int basePrice) {
    }

}
