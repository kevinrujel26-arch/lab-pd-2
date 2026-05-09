package Adapter;

public class AdaptadorPavo implements Pato {

    Pavo pavo;

    public AdaptadorPavo(Pavo pavo) {
        this.pavo = pavo;
    }

    @Override
    public void cuaquear() {
        pavo.gluglutear();
    }

    @Override
    public void volar() {
        for (int i = 0; i < 5; i++) {
            pavo.volar();
        }
    }
}
