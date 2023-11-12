package ExcepcionesPropias;
/**
 * Clase NoHayProductoException subclase de Exception
 */
public class NoHayProductoException extends Exception {
    /**
     * Constructor
     */
    public NoHayProductoException() {
        super();
    }
    /**
     * Metodo que envia el mensaje
     */
    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }

}