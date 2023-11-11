import java.util.ArrayList;
/**
 * Clase Deposito, es la encargada de almacenar las monedas, bebidas y dulces en el Expendedor.
 * @param <E> objeto generico que sera determinado y contenido en el expendedor.
 */
class Deposito<E> {
    private ArrayList<E> Lista;
    /**
     * Constructor, no recibe parametros y solo inicializa la Lista
     */
    public Deposito(){
        Lista = new ArrayList<E>();
    }

    /**
     * Metodo que retira un objeto de la lista, y en caso de no haber producto retornara null.
     * @return Un objeto del deposito o null.
     */
    public E get(){
        if(Lista.size()!=0){
            return Lista.remove(0);
        } else {
            return null;
        }
    }
    /**
     * Metodo que agrega elementos al Arraylist.
     * @param bob es el elemento que sera agregado al Arraylist.
     */
    public void add(E bob){
        Lista.add(bob);
    }
    /**
     * Metodo encargado de comprobar que el deposito esta vacio.
     * @return Retorna el tamaño del deposito (numero de elementos en el)
     */
    public int chequear(){
        return Lista.size();
    }
}

