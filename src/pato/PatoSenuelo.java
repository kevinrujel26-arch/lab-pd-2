
package pato;

public class PatoSenuelo extends Pato {
    public PatoSenuelo(){
       volable = new NoVuela(); 
       cuaqueable = new CuaqueoMudo();
       
   }
    public void mostrar(){
        System.out.println("Yo soy un pato Senuelo");
    }
    
}
