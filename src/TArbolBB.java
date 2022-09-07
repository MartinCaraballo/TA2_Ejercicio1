
public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;
    private int longitud;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
        longitud = 0;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (raiz == null) {
            raiz = unElemento;
            longitud++;
            return true;
        }
        else {
            if (raiz.insertar(unElemento)) {
                longitud++;
                return true;
            }
        }
        return false;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
           TElementoAB<T> result = null;
           if (raiz == null)
           {
               result = raiz.buscar(unaEtiqueta);
           }
           return result;   
    }
    
    public int getLongitud() {
        return longitud;
    }

    @Override
    public String preOrden() {
        if (raiz == null) {
            return "No hay elementos.";
        } else {
            return raiz.preOrden();
        }
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
