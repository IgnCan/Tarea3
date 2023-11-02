

class Comprador{
    private String sonido;
    private int vuelto;


    public Comprador(Moneda m, int queProducto, Expendedor exp)
            throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {

        try {
            Producto compra = exp.comprarProducto(m,queProducto);
            while (true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception a) {
                    break;
                }
            }
            sonido=compra.bebercomer();
        } catch (NoHayProductoException a){
            while (true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception c) {
                    break;
                }
            }
            System.out.println(vuelto);
            sonido=null;
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
            System.out.println(vuelto);
            System.out.println("Error: " + b.getMessage());
        } catch (PagoIncorrectoException d){
            sonido=null;
            System.out.println("Error: " + d.getMessage());
        }
    }

    public int cuantoVuelto(){
        //System.out.println(vuelto);
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }

}
