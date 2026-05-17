public class VentanaDeComputador implements Pantalla{
    @Override
    public void mostrarEnPantalla(float numero){
        System.out.println("La temperatura en la venta es : " +numero);
    }
}