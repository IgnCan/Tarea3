
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    PanelMonedas monedas = null;
    PanelDispensador dispensador= null;
    PanelComprador comprador = null;



    public Ventana() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        //      Esto indica el ancho y largo respectivamente, recibe dos int
        this.setSize(1000, 800);

        //Al dejar esto en null centra el programa al abrirlo
        setLocationRelativeTo(null);

        // Cierra el programa al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Bonito Dispensador :D (estoy cansado jefe)");

        //Crea el panel
        setLayout(new BorderLayout());


        dispensador = new PanelDispensador(comprador);
        this.getContentPane().add(dispensador);

        monedas = new PanelMonedas(dispensador);
        this.getContentPane().add(monedas);

        comprador = new PanelComprador();
        this.getContentPane().add(comprador);





//        PanelDispensador dispensador = new PanelDispensador();
//        this.getContentPane().add(dispensador);
//
//        PanelMonedas monedas = new PanelMonedas(dispensador);
//        this.getContentPane().add(monedas);
//
//        PanelComprador comprador = new PanelComprador();
//        this.getContentPane().add(comprador);

        // Establece las posiciones de los JPaneles
        add(monedas, BorderLayout.WEST);
        add(dispensador, BorderLayout.CENTER);
        add(comprador, BorderLayout.EAST);

        //Establece el tamaño de los JPaneles
        monedas.setPreferredSize(new Dimension(300, 400));
        dispensador.setPreferredSize(new Dimension(400, 400));
        comprador.setPreferredSize(new Dimension(300, 400));


    }



}