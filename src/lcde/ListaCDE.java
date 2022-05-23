package lcde;

public class ListaCDE {
    Nodo inicio;

    public ListaCDE(){
        inicio = null;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void insertarFinal(Object dato){
        if (estaVacia()){
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguinte(nuevo);
            inicio=nuevo;
        }else {
            Nodo ultimo = inicio;
            while (ultimo.getSiguinte() != inicio){
                ultimo=ultimo.getSiguinte();
            }
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguinte(inicio);

            ultimo.setSiguinte(nuevo);
            inicio.setAnterior(nuevo);
        }
    }
    public void eliminarFin(){
        if (!estaVacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguinte() != inicio){
                ultimo=ultimo.getSiguinte();
            }
            Nodo penultimo = ultimo.getAnterior();
            penultimo.setSiguinte(inicio);
            inicio.setAnterior(penultimo);
        }
    }
    public void mostrar(){
        if (!estaVacia()){
            Nodo tmp = inicio;
            while (tmp.getSiguinte() != inicio){
                System.out.print(tmp.getDato()+"  ");
                tmp = tmp.getSiguinte();
            }
            System.out.println(tmp.getDato());
        }
    }
    public void mostrarAdelante(int vueltas){
        if (!estaVacia()){
            Nodo tmp = inicio;
            int cont = 0;
            while (cont < vueltas){
                if (tmp.getSiguinte() == inicio){
                    cont++;
                }
                System.out.print(tmp.getDato()+"  ");
                tmp=tmp.getSiguinte();
            }
            System.out.println();
        }
    }
    public void mostrarAtraz(int vueltas){
        if (!estaVacia()){
            Nodo tmp = inicio.getAnterior();
            int cont = 0;
            while (cont < vueltas){
                if (tmp.getAnterior() == inicio){
                    cont++;
                }
                System.out.print(tmp.getDato()+"  ");
                tmp=tmp.getAnterior();
            }
            System.out.println(tmp.getDato());
        }
    }
}
