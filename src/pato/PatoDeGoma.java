
package pato;

public class PatoDeGoma extends Pato {
    public PatoDeGoma(){
        volable = new NoVuela();
        cuaqueable = new Chirreo(); 
    }
    
    public void mostrar(){
        System.out.println("Yo soy un patito de Goma");
    }
    
}