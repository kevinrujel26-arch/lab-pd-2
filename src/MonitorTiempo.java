public class MonitorTiempo {
    float temperatura;
    Pantalla pantalla;

    public MonitorTiempo(Pantalla pantalla, float temperatura){
        this.pantalla= pantalla;
        this.temperatura=temperatura;

    }

    float getTemperatura(){
        return temperatura;
    }

    public void mostrarEnPantalla(){
        pantalla.mostrarEnPantalla(temperatura);

    }
}