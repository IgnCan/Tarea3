import ExcepcionesPropias.NoHayProductoException;
import ExcepcionesPropias.PagoIncorrectoException;
import ExcepcionesPropias.PagoInsuficienteException;
/**
 * Clase comprador, es quien como su nombre lo indica ejecuta la compra.
 */
class Comprador{
    /**
     * String sonido - Que es el comprador diciendo que compro en caso de una compra exitosa.
     */
    private String sonido;
    /**
     * int vuelto - Que es el comprador diciendo cuanto vuelto obtuvo de su compra.
     */
    private int vuelto;
    /**
     * Producto compraBuena - Es el objeto Producto de la compra.
     */
    private Producto compraBuena = null;
    /**
     * String ProdSerie -  Es la serie del producto.
     */
    private String ProdSerie;
    /**
     * Constructor del comprador, aca es donde se ejecuta la compra.
     * @param m Es el objeto Moneda con la que realizara la compra.
     * @param queProducto Es el ID del producto en el dispensador.
     * @param exp Es un objeto expendedor.
     * @throws NoHayProductoException En caso de no haber producto o "queProducto" invalido, se recogera el vuelto, ProdSerie sera "null" y sonido sera null.
     * @throws PagoInsuficienteException En caso de pago insuficiente, se recogera el vuelto, ProdSerie sera "null" y sonido sera null.
     * @throws PagoIncorrectoException En este caso, ProdSerie sera "null" y sonido sera null, no hay moneda para devolver.
     */
    public Comprador(Moneda m, int queProducto, Expendedor exp)
            throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {

        try {
            exp.comprarProducto(m,queProducto);
            while (true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception a) {
                    break;
                }
            }
            compraBuena=exp.getProducto();
            sonido=compraBuena.bebercomer();
            ProdSerie= String.valueOf(compraBuena.getSerie());
        } catch (NoHayProductoException a){
            while (true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception c) {
                    break;
                }
            }
            sonido=null;
            ProdSerie="null";
            System.out.println("Error: " + a.getMessage());
        } catch (PagoInsuficienteException b){
            while (true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception a) {
                    break;
                }
            }
            sonido=null;
            ProdSerie="null";
            System.out.println("Error: " + b.getMessage());
        } catch (PagoIncorrectoException d){
            ProdSerie="null";
            sonido=null;
            System.out.println("Error: " + d.getMessage());
        }
    }
    /**
     * @return int vuelto total de la compra
     */
    public int cuantoVuelto(){
        //System.out.println(vuelto);
        return vuelto;
    }
    /**
     * @return retorna el sonido de que compró
     */
    public String queBebiste(){
        return sonido;
    }
    /**
     * @return retorna el producto que se obtuvo del proceso de compra.
     */
    public Producto queCompra(){
        return compraBuena;
    }
    /**
     * @return retorna la serie del producto.
     */
    public String getProdSerie(){
        return ProdSerie;
    }

}
