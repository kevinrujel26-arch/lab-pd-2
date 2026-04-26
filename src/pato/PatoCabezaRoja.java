package pato;

public class PatoCabezaRoja extends Pato {

    public PatoCabezaRoja() {
        volable = new VuelaConAlas();
        cuaqueable = new Cuaqueo();
    }

    public void mostrar() {
        System.out.println("Yo soy un real PATO CABEZA ROJA");
    }

}
