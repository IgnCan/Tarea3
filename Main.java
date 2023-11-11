import ExcepcionesPropias.NoHayProductoException;
import ExcepcionesPropias.PagoIncorrectoException;
import ExcepcionesPropias.PagoInsuficienteException;
/**
 * Main principal de ejecucion, aca se ejecuta el programa
 * @author Ignacio Candia - 2019411195
 * @author Paula San Martin -
 * @see PanelDispensador para modificar la cantidad de productos iniciales
 */
public class Main {
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
    }
}
