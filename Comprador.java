class Comprador{
    private String sonido;
    private int vuelto;
    private Producto compraBuena = null;

    private String ProdSerie;


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
//            sonido=compra.bebercomer();
        } catch (NoHayProductoException a){
            while (true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception c) {
                    break;
                }
            }
            //System.out.println(vuelto);
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

    public int cuantoVuelto(){
        //System.out.println(vuelto);
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }

    public Producto queCompra(){
        return compraBuena;
    }

    public String getProdSerie(){
        return ProdSerie;
    }

}
