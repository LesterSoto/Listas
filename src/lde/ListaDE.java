package lde;

public class ListaDE {
    Nodo inicio;

    public ListaDE(){
        inicio = null;
    }
    public boolean estaVacio(){
        return inicio == null;
    }
    public void insertar(Object dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(null,dato,null);
            inicio=nuevo;
        }else {
            Nodo nuevo = new Nodo(null,dato,inicio);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }
    public void eliminar(){
        if (!estaVacio()){
            if (inicio.getSiguiente() == null){
                inicio = inicio.getSiguiente();
            }else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
    }
    public void mostrar(){
        if (!estaVacio()){
            Nodo tmp = inicio;
            while (tmp != null){
                System.out.print(tmp.getDato()+"  ");
                tmp = tmp.getSiguiente();
            }
            System.out.println();
        }
    }
    public void mostrarAtraz(){
        if (!estaVacio()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }
            Nodo tmp = ultimo;
            while (tmp != null){
                System.out.print(tmp.getDato()+"  ");
                tmp = tmp.getAnterior();
            }
            System.out.println();
        }
    }
}
