package lcde;

public class Nodo {
    private Nodo anterior;
    private Object dato;
    private Nodo siguinte;

    public Nodo() {
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguinte() {
        return siguinte;
    }

    public void setSiguinte(Nodo siguinte) {
        this.siguinte = siguinte;
    }
}
