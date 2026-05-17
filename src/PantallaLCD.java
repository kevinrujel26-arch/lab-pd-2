public class PantallaLCD implements Observer {
    @Override
    public void actualizar(float temperatura) {
        System.out.println("La temperatura en la pantalla LCD es : " +temperatura);
    }
}
