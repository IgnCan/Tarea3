import ExcepcionesPropias.NoHayProductoException;
import ExcepcionesPropias.PagoIncorrectoException;
import ExcepcionesPropias.PagoInsuficienteException;

/**
 * Clase expendedor, es donde se recibe la moneda y el producto pedido, de ingresar valores correctos agrega el producto, la moneda con que le hizo la compra y el vuelto a sus depositos correspondientes
 * Tiene Arraylists para cada producto, vuelto, monedas de compra, y producto comprado
 */
public class Expendedor{
    private Deposito<Bebida> coca= new Deposito<>();
    private Deposito<Bebida> sprite= new Deposito<>();
    private Deposito<Bebida> fanta= new Deposito<>();
    private Deposito<Dulce> super8= new Deposito<>();
    private Deposito<Dulce> snikers= new Deposito<>();
    private Deposito<Moneda> monVu= new Deposito<>();
    private Deposito<Moneda> monCompra = new Deposito<>();
    private Deposito<Producto> DepProd = new Deposito<>();
    /**
     * Aca se le asigna la ID con que se identificara a cada producto en el expendedor y su precio
     */
    public enum product{
        COCA(1,300),
        SPRITE(2,1000),
        FANTA(3,600),
        SUPER8(4,700),
        SNIKERS(5,500);

        private final int presio;
        private final int id;
        /**
         * Constructor de product
         * @param i Es la Id de cada producto con la que se buscara en el expendedor al momento de la compra
         * @param precio Es el precio asignado a cada producto
         */
        product(int i, int precio) {
            this.id=i;
            this.presio=precio;
        }
        /**
         * Metodo que retorna el precio de un producto
         * @return Precio de un producto
         */
        public int getPresio() {
            return presio;
        }
        /**
         * Metod que retorna la ID con que el dispensador reconoce al producto
         * @return ID
         */
        public int getId() {
            return id;
        }
    }
    /**
     * Constructor del expendedor, solo rellena el expendedor con la cantidad de productos pedida y les asigna un ID
     * @param numProductos El numero de productos con que se llenara el dispensador.
     */
    public Expendedor(int numProductos){

        for (int i =1;i<numProductos+1;i=i+1){
            coca.add(new CocaCola(1*i));
            sprite.add(new Sprite(2*i));
            fanta.add(new Fanta(3*i));
            super8.add(new Super8(4*i));
            snikers.add(new Snikers(5*i));
        }

    }
    /**
     * Metodo principal del expendedor, aca es donde se realiza el proceso de compra del producto.
     * @param m Objeto moneda con que se realizara la compra.
     * @param prod ID del producto dado por "Public enum product", le dice al expendedor que producto eligio el comprador, este numero entra al switch y deposita la moneda de la compra, producto y vuelto en los depositos correspondientes para cada caso.
     * @throws NoHayProductoException Se lanza cuando no hay del producto solicitado o usando un "prod" invalido.
     * @throws PagoIncorrectoException Se lanza cuando no se ha ingresado una moneda al expendedor (Moneda Null).
     * @throws PagoInsuficienteException Se lanza si la moneda con la que se intento pagar el producto no es suficiente.
     */
    public void comprarProducto(Moneda m, int prod)
            throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        if(m==null){
            throw new PagoIncorrectoException();
        }
        switch (prod) {
            case 1: {

                if (m.getValor() >= product.COCA.getPresio() && coca.chequear() != 0) {

                    for (int i = 1; i <= (m.getValor() - product.COCA.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    monCompra.add(m);
                    DepProd.add(coca.get());
                    return;

                } else if (coca.chequear()==0) {
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");
                }else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");

                }

            }
            case 2: {
                if (m.getValor() >= product.SPRITE.getPresio() && sprite.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.SPRITE.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    DepProd.add(sprite.get());
                    return;

                } else if (sprite.chequear()==0) {
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                } else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            case 3: {
                if (m.getValor() >= product.FANTA.getPresio() && fanta.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.FANTA.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    DepProd.add(fanta.get());
                    return;
                } else if (fanta.chequear()==0) {

                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                } else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            case 4: {
                if (m.getValor() >= product.SUPER8.getPresio() && super8.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.SUPER8.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    DepProd.add(super8.get());
                    return;
                } else if (super8.chequear()==0) {
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                }else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            case 5: {
                if (m.getValor() >= product.SNIKERS.getPresio() && snikers.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.SNIKERS.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    DepProd.add(snikers.get());
                    return;

                } else if (snikers.chequear()==0) { //caso moneda valida, pero cont vacio
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                } else { //caso moneda valida, pero mucho precio
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            // caso moneda valida, id mala
            default: {
                monVu.add(m);
                throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");
            }

        }

    }
    /**
     * Metodo que llama a una moneda del deposito de vuelto, debe ser llamada por el comprador e interpretarse como este sacando las monedas una a una.
     * @return Moneda del deposito de vuelto
     */
    public Moneda getVuelto(){
        return monVu.get();
    }
    /**
     * Metodo que llama a un producto del deposito de producto, debe ser llamada por el comprador e interpretarse como este sacando el producto que compró.
     * @return Producto del deposito de productos.
     */
    public Producto getProducto(){
        return DepProd.get();
    }
    /**
     * Metodo que retorna cuantos elementos de coca-cola quedan en su dispensador
     * @return int chequear de su dispensador
     */
    public int cocaTamaño(){
        return coca.chequear();
    }
    /**
     * Metodo que retorna cuantos elementos de sprite quedan en su dispensador
     * @return int chequear de su dispensador
     */
    public int spriteTamaño(){
        return sprite.chequear();
    }
    /**
     * Metodo que retorna cuantos elementos de fanta quedan en su dispensador
     * @return int chequear de su dispensador
     */
    public int fantaTamaño(){
        return fanta.chequear();
    }
    /**
     * Metodo que retorna cuantos elementos de super8 quedan en su dispensador
     * @return int chequear de su dispensador
     */
    public int super8Tamaño(){
        return super8.chequear();
    }    /**
     * Metodo que retorna cuantos elementos de snickers quedan en su dispensador
     * @return int chequear de su dispensador
     */
    public int snickersTamaño(){
        return snikers.chequear();
    }
}
