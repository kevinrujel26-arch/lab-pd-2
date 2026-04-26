
package pato;

public class SimPato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pato patoReal = new PatoReal();
        patoReal.mostrar();
        patoReal.realizarCuaqueo();
        patoReal.realizarVuelo();
        patoReal.nadar();

        System.out.println();

        Pato patoGoma = new PatoDeGoma();
        patoGoma.mostrar();
        patoGoma.realizarCuaqueo();
        patoGoma.realizarVuelo();
        patoGoma.nadar();

        System.out.println();
        Pato patoSenuelo = new PatoSenuelo();
        patoSenuelo.mostrar();
        patoSenuelo.realizarCuaqueo();
        patoSenuelo.realizarVuelo();
        patoSenuelo.nadar();

        System.out.println();
        Pato patoCabezaRoja = new PatoCabezaRoja();
        patoCabezaRoja.mostrar();
        patoCabezaRoja.realizarCuaqueo();
        patoCabezaRoja.realizarVuelo();
        patoCabezaRoja.nadar();

    }
    
}
