
/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TElementoAB<Integer> elemento = new TElementoAB(10, 10);
        TElementoAB<Integer> elemento2 = new TElementoAB(2, 2);
        TElementoAB<Integer> elemento3 = new TElementoAB(15, 15);
        TElementoAB<Integer> elemento4 = new TElementoAB(1, 1);
        TElementoAB<Integer> elemento5 = new TElementoAB(26, 26);
        TElementoAB<Integer> elemento6 = new TElementoAB(4, 4);
        TArbolBB<Integer> arbolBusqueda = new TArbolBB<>();
        arbolBusqueda.insertar(elemento);
        arbolBusqueda.insertar(elemento2);
        arbolBusqueda.insertar(elemento3);
        arbolBusqueda.insertar(elemento4);
        arbolBusqueda.insertar(elemento5);
        arbolBusqueda.insertar(elemento6);
        System.out.println("");
        //System.out.println(arbolBusqueda.getLongitud());
         /*
        String[] claves = ManejadorArchivosGenerico.leerArchivo("src/claves1.txt");
        String[] salida = new String[claves.length];
        TArbolBB<String> arbolBusqueda = new TArbolBB<>();
        for (int i = 0; i < claves.length; i++) {
            String clave = claves[i];
            TElementoAB<String> elemento = new TElementoAB(clave, clave);
            arbolBusqueda.insertar(elemento);
            String lineaAAgregar = clave + "\t| " + arbolBusqueda.getLongitud();
            salida[i] = lineaAAgregar;
        }*/
        //ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", salida);
        System.out.println(arbolBusqueda.preOrden());

    }

}
