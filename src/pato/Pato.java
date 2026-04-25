package pato;

public abstract class Pato {

    Volable volable;
    Cuaqueable cuaqueable;

    public void setVolable(Volable fb) {
        this.volable = fb;
    }

    public void setCuaqueable(Cuaqueable qb) {
        this.cuaqueable = qb;
    }

    public abstract void mostrar();

    public void realizarVuelo() {
        volable.volar();
    }

    public void realizarCuaqueo() {
        cuaqueable.cuaquear();
    }

    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }

}
