import lcse.ListaCSE;
import lde.ListaDE;
import lse.ListaSE;
import Lcde.ListaCDE;

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

        listaCSE.eliminarFin();
        listaCSE.eliminarFin();

        listaCSE.mostrar();

        listaCSE.mostrarCircular(2);

         */
        ListaCDE listaCDE = new ListaCDE();
        System.out.println(listaCDE.estaVacia());

        for (int i = 1; i <= 10; i++) {
            listaCDE.insertarFinal(i);
        }
        listaCDE.mostrar();

        listaCDE.eliminarFin();
        listaCDE.eliminarFin();
        listaCDE.eliminarFin();

        listaCDE.mostrar();

        listaCDE.mostrarAdelante(3);

        listaCDE.mostrarAtraz(3);
    }
}
