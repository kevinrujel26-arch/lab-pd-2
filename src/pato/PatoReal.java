
package pato;

/**
 *
 * @author USUARIO
 */
public class PatoReal extends Pato {

    public PatoReal(){
        volable = new VuelaconAlas();
        cuaqueable = new Cuaqueo();
    }
    
    public void mostrar(){
        System.out.println("Yo soy un verdadero PATO REAL");
    }
    
    
}