import java.util.ArrayList;
import java.util.List;

public class MonitorTiempo implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private float temperatura;

    @Override
    public void agregarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void eliminarObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservers() {

        for (Observer o : observers) {
            o.actualizar(temperatura);
        }
    }

    public void setTemperatura(float temperatura) {

        this.temperatura = temperatura;

        notificarObservers();
    }
}