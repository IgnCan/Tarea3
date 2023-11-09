
public class MainEjecucion {


    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {


        // caso, espendedor valido y..
        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        Comprador c = null;


        //moneda nula, debe devolver la excepcion PagoIncorrectoException [null,0]
//            m = null;
//            c = new Comprador(m, 1, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        //moneda valida, sobra plata
//            m = new Moneda500();
//            c = new Comprador(m, 1, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        //moneda valida, poca plata (Sprite,2000) [PagoInsuficienteException, null, 1000]
        m = new Moneda1000();
        c = new Comprador(m, 2, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        // moneda valida, precio justo (snikers, 500) [snikers, 0]
//            m = new Moneda500();
//            c = new Comprador(m, 5, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        // moneda valida, producto no existente [NoHayProductoException, null, 1000]
//            m = new Moneda1000();
//            c = new Comprador(m, 7, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        // moneda valida, sobra plata, pero no queda producto (snikers, 500) [NoHayProductoException',null, 500]
//            m = new Moneda1000();
//            c = new Comprador(m, 5, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

    }
}
