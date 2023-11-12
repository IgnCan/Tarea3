package ExcepcionesPropias;
/**
 * Clase PagoIncorrectoException subclase de Exception
 */
public class PagoIncorrectoException extends Exception {
    /**
     * Constructor
     */
    public PagoIncorrectoException() {
        super("Excepcion de pago incorrecto");
    }
    /**
     * Metodo que envia el mensaje
     */
    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}
