public class PantallaDeRelojInteligente implements Observer {
    @Override
    public void actualizar(float temperatura){
        System.out.println("La temperatura en la pantalla de Reloj Inteligente es : " +temperatura);
    }
}
