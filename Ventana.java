
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    Expendedor exp = new Expendedor(1);
    //Moneda m = null;
    //Comprador c = null;


    public Ventana() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
//      Esto indica el ancho y largo respectivamente, recibe dos int
        this.setSize(1000,800);

        //Al dejar esto en null centra el programa al abrirlo
        setLocationRelativeTo(null);

        // Cierra el programa al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Bonito Dispensador :D (estoy cansado jefe)");
        Paneles();
    }

    public void Paneles() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        //Crea el panel
        setLayout(new BorderLayout());

        JPanel monedas = new PanelMonedas();
        this.getContentPane().add(monedas);


        JPanel dispensador = new PanelDispensador();
        this.getContentPane().add(dispensador);

        JPanel comprador = new PanelComprador();
        this.getContentPane().add(comprador);

        // Establece las posiciones de los JPaneles
        add(monedas,BorderLayout.WEST);
        add(dispensador,BorderLayout.CENTER);
        add(comprador,BorderLayout.EAST);

        //Establece el tamaño de los JPaneles
        monedas.setPreferredSize(new Dimension(300, 400));
        dispensador.setPreferredSize(new Dimension(400, 400));
        comprador.setPreferredSize(new Dimension(300, 400));

        setVisible(true);

        Moneda a= ((PanelMonedas) monedas).getM();
        //Producto aa= ((PanelDispensador) dispensador).getP();
        ((PanelDispensador) dispensador).settA(a);



    }

}