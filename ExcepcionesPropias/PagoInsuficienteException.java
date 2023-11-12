package ExcepcionesPropias;
/**
 * Clase PagoInsuficienteException subclase de Exception
 */
public class PagoInsuficienteException extends Exception {
    /**
     * Constructor
     */
    public PagoInsuficienteException() {
        super();
    }
    /**
     * Metodo que envia el mensaje
     */
    public PagoInsuficienteException(String mensaje) {
        super(mensaje);
    }

}