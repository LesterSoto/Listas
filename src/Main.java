import lse.ListaSE;

public class Main {
    public static void main(String[] args) {
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
    }
}
