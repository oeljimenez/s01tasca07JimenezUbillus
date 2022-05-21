package it.academy.java.sprint1.tasca7.n1exercisi1;

public class Exercisi1 {

    public static void main(String[] args) {
        System.out.println("Tasca 07. Annotations (Spring1), Nivell 1, Exercisi 1");

        Treballador treballador = new Treballador();
        treballador.nom= "leo";
        treballador.congnom= "Jimenez";
        treballador.preuHora = 10d;
        System.out.println(treballador.calcularSou(40));

        TreballadorOnline treballadorOnline = new TreballadorOnline();
        treballadorOnline.nom= "leo";
        treballadorOnline.congnom= "Jimenez";
        treballadorOnline.preuHora = 10d;
        System.out.println(treballadorOnline.calcularSou(40));

        TreballadorPresencial treballadorPresencial = new TreballadorPresencial();
        treballadorPresencial.nom= "leo";
        treballadorPresencial.congnom= "Jimenez";
        treballadorPresencial.preuHora = 10d;
        System.out.println(treballadorPresencial.calcularSou(40,125));
    }
}
