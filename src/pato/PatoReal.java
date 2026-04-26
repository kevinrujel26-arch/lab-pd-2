package pato;

public class PatoReal extends Pato {

 public PatoReal(){
        volable = new VuelaConAlas();
        cuaqueable = new Cuaqueo();
    }
    
    public void mostrar(){
        System.out.println("Yo soy un verdadero PATO REAL");
    }

    
}
