//import ExcepcionesPropias.NoHayProductoException;
//import ExcepcionesPropias.PagoIncorrectoException;
//import ExcepcionesPropias.PagoInsuficienteException;

// hare pruebas de ejecucion aca en lo que aprendo junit
//public class MainEjecucion {

    // Cosas importantes wue faltan:
    // * que devuelva la moneda directamente cuando no pueda comprar (que no la sencille)
    // * agregar excepciones ())
    // - que excepciones devuelvan la plata (y españa el oro)

//    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {

        // try y catch van aca por pauta

        // caso, espendedor valido y..
//        Expendedor exp = new Expendedor(1);
//        Moneda m = null;
//        Comprador c = null;


        //moneda nula, debe devolver la excepcion PagoIncorrectoException [null,0]
//            m = null;
//            c = new Comprador(m, 1, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        //moneda valida, sobra plata
//            m = new Moneda500();
//            c = new Comprador(m, 1, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        //moneda valida, poca plata (Sprite,2000) [PagoInsuficienteException, null, 1000]
//        m = new Moneda1000();
//        c = new Comprador(m, 2, exp);
//        System.out.println(c.queBebiste());
//        System.out.println(c.cuantoVuelto());

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

//    }
//}
