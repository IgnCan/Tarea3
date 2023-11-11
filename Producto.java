/**
 *  Clase abstracta de producto, solo tienen como propiedad un numero de serie por definir.
 */
abstract class Producto{
    private final int serie;
    /**
     * Constructor, crea un producto.
     * @param serie: almacena el numero de serie de el producto.
     */
    public Producto(int serie) {
        this.serie= serie;
    }
    /**
     * Metodo que retorna el numero de serie de un producto
     * @return El numero de serie del producto
     */
    public int getSerie() {
        return serie;
    }
    /**
     * Metodo abstracto que retorna el sabor de un producto, un string que indica que es.
     */
    public abstract String bebercomer();
}
/**
 * Dulce: subclase de producto
 */
abstract class Dulce extends Producto{
    /**
     * Constructor
     * @param serie indica la serie del Producto.
     */
    public Dulce(int serie) {
        super(serie);
    }
}
/**
 * Snikers: subclase de Dulce.
 */
class Snikers extends Dulce{
    /**
     * Constructor
     * @param ser indica la serie del dulce.
     */
    public Snikers(int ser) {
        super(ser);
    }
    /**
     * @return indica el nombre del producto que comió.
     */
    public String bebercomer() {
        return "Snikers";
    }
}
class Super8 extends Dulce{
    /**
     * Constructor
     * @param ser indica la serie del dulce.
     */
    public Super8(int ser) {
        super(ser);
    }
    /**
     * @return indica el nombre del producto que comió.
     */
    public String bebercomer() {
        return "Super8";
    }
}
/**
 *  Bebida: subclase de Producto
 */
abstract class Bebida extends Producto{
    /**
     * Constructor
     * @param serie indica la serie dela bebida
     */
    public Bebida(int serie) {
        super(serie);
    }
}
/**
 *  Coca-cola: subclase de Bebida
 */
class CocaCola extends Bebida{
    /**
     * Constructor
     * @param ser indica la serie dela bebida
     */
    public CocaCola(int ser){
        super(ser);
    }
    /**
     * @return indica el nombre del producto que comió.
     */
    public String bebercomer(){
        return "cocacola";
    }
}
/**
 *  Fanta: subclase de Bebida
 */
class Fanta extends Bebida{
    /**
     * Constructor
     * @param ser indica la serie dela bebida
     */
    public Fanta(int ser){
        super(ser);
    }
    /**
     * @return indica el nombre del producto que comió.
     */
    public String bebercomer(){
        return "Fanta";
    }
}
/**
 *  Sprite: subclase de Bebida
 */
class Sprite extends Bebida{
    /**
     * Constructor
     * @param ser indica la serie dela bebida
     */
    public Sprite(int ser){
        super(ser);
    }
    /**
     * @return indica el nombre del producto que comió.
     */
    public String bebercomer(){
        return "sprite";
    }
}




