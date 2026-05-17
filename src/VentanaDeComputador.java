public class VentanaDeComputador implements Observer {
    @Override
    public void actualizar(float temperatura){
        System.out.println("La temperatura en la ventana es : " +temperatura);
    }
}