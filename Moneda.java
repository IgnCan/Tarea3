import java.util.Random;

/**
 * Clase abstracta moneda, sirve para crear las que tienen valor definido.
 */
public abstract class Moneda{
    private int serie;

    /**
     * Constructor de la clase asbtracta.
     */
    public Moneda(){
        Random random = new Random();
        serie = random.nextInt(Integer.MAX_VALUE) + 1;
    }
    /**
     * Lector de serie de la moneda.
     */
    public int getSerie(){
        return serie;
    }
    /**
     * Metodo abstracto que retorna el valor de la moneda.
     */
    public abstract int getValor();


}
/**
 * Clase hija de Moneda, esta tiene un valor concreto de 100.
 */
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }
}
/**
 * Clase hija de Moneda, esta tiene un valor concreto de 500.
 */

class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
}
/**
 * Clase hija de Moneda, esta tiene un valor concreto de 1000.
 */
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return 1000;
    }
}
