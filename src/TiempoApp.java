public class TiempoApp {
    public static void main(String[] args) {

        MonitorTiempo monitor = new MonitorTiempo();

        monitor.agregarObserver(new PantallaLCD());
        monitor.agregarObserver(new VentanaDeComputador());
        monitor.agregarObserver(new PantallaDeRelojInteligente());

        monitor.setTemperatura(20);
    }
}
