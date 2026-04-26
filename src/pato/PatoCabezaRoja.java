
package pato;

public class PatoCabezaRoja extends Pato {
        public PatoCabezaRoja(){
        volable = new VuelaconAlas();
        cuaqueable= new Cuaqueo();
    }
    
    public void mostrar(){
        System.out.println("Yo soy un real PATO CABEZA ROJA");
    }
    
}
