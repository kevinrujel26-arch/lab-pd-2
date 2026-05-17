public class PantallaLCD implements Pantalla{
    @Override
    public void mostrarEnPantalla(float numero){
        System.out.println("La temperatura en la pantalla LCD es : " +numero);
    }
}
