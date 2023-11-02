package Ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
//        Esto indica el ancho y largo respectivamente, recibe dos int
        this.setSize(1000,800);

//         Establece la posicion donde aparece la ventana
//        setLocation(250,250);

//        Esto engloba los dos anteriores
//        setBounds(0,0,500,500);

        //Al dejar esto en null centra el programa
        setLocationRelativeTo(null);

        // Cierra el programa al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Se explica solo
        setTitle("Bonito Dispensador :D (estoy cansado jefe)");

        paneles();


    }

    private void paneles(){
        //Crea el panel
        setLayout(new BorderLayout());

        JPanel monedas = new JPanel();
        monedas.setBackground(Color.RED);
        this.getContentPane().add(monedas);


        JPanel dispensador = new JPanel();
        dispensador.setBackground(Color.CYAN);
        this.getContentPane().add(dispensador);


        JPanel comprador = new JPanel();
        comprador.setBackground(Color.BLACK);
        this.getContentPane().add(comprador);


        add(monedas,BorderLayout.WEST);
        add(dispensador,BorderLayout.CENTER);
        add(comprador,BorderLayout.EAST);

        monedas.setPreferredSize(new Dimension(300, 400));
        dispensador.setPreferredSize(new Dimension(400, 400));
        comprador.setPreferredSize(new Dimension(300, 400));


    }

}
