import java.util.EventObject;

public class EnviaComprador extends EventObject {
    private Comprador compra;

    public EnviaComprador(Object source, Comprador envioC) {
        super(source);
        this.compra = envioC;
    }

    public Comprador getComprador() {
        return compra;
    }
}
