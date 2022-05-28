import lse.ListaSE;
<<<<<<< HEAD

public class Main {
    public static void main(String[] args) {
        /*
        ListaSE listaSE = new ListaSE();

        System.out.println(listaSE.estaVacio());

        listaSE.insertar(1);
        listaSE.insertar(2);
        listaSE.insertar(3);
        listaSE.insertar(5);

        listaSE.mostrar();

        listaSE.eliminar();
        listaSE.eliminar();

        listaSE.mostrar();

        ListaDE listaDE = new ListaDE();
        System.out.println(listaDE.estaVacio());

        for (int i = 20; i > 0; i--) {
            listaDE.insertar(i);
        }

        System.out.println(listaDE.estaVacio());

        listaDE.mostrar();

        listaDE.eliminar();
        listaDE.eliminar();
        listaDE.eliminar();

        listaDE.mostrar();

        listaDE.mostrarAtraz();

        ListaCSE listaCSE = new ListaCSE();
        System.out.println(listaCSE.estaVacio());
        System.out.println(listaCSE.tamano());

        for (int i = 1; i <= 12; i++) {
            listaCSE.insertarFin(i);
        }
        listaCSE.mostrar();

        System.out.println(listaCSE.tamano());

<<<<<<< HEAD
        listaCSE.eliminarFin();
        listaCSE.eliminarFin();

        listaCSE.mostrar();
        listaCSE.mostrarCircular(2);
         */

=======
import pc.Cola;
import pc.Pila;
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println(pila.estaVacio());

        for (int i = 1; i <= 5; i++) {
            pila.insertar(i);
        }
        pila.mostrar();

        pila.eliminar();
        pila.eliminar();

        pila.mostrar();
>>>>>>> 547a343080dace0158cca693a95c44c8bb81f0f8
    }
}
