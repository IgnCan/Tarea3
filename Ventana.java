
import ExcepcionesPropias.NoHayProductoException;
import ExcepcionesPropias.PagoIncorrectoException;
import ExcepcionesPropias.PagoInsuficienteException;
import javax.swing.*;
import java.awt.*;

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

        comprador = new PanelComprador();
        this.getContentPane().add(comprador);

        dispensador = new PanelDispensador(comprador);
        this.getContentPane().add(dispensador);

        monedas = new PanelMonedas(dispensador);
        this.getContentPane().add(monedas);


        // Establece las posiciones de los JPaneles
        add(monedas, BorderLayout.WEST);
        add(dispensador, BorderLayout.CENTER);
        add(comprador, BorderLayout.EAST);

        //Establece el tamaño de los JPaneles
        monedas.setPreferredSize(new Dimension(300, 400));
        dispensador.setPreferredSize(new Dimension(400, 400));
        comprador.setPreferredSize(new Dimension(300, 400));

        dispensador.addActivarBotonesListener(new ActivarBotonesListener() {
            @Override
            public void activarBotones() {
                // Desactivar todos los botones
                monedas.mon100.setEnabled(true);
                monedas.mon500.setEnabled(true);
                monedas.mon1000.setEnabled(true);
            }
        });


    }



}