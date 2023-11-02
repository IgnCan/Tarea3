package Ventana;

import javax.swing.*;
import java.awt.*;

public class MiAplicacion {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de BorderLayout");

        // Configura el administrador de diseño del JFrame como BorderLayout
        frame.setLayout(new BorderLayout());

        // Crea los tres JPanels
        JPanel panelIzquierda = new JPanel();
        JPanel panelCentro = new JPanel();
        JPanel panelDerecha = new JPanel();

        // Agrega contenido a los JPanels
        panelIzquierda.setBackground(Color.RED);
        panelCentro.setBackground(Color.GREEN);
        panelDerecha.setBackground(Color.BLUE);

        // Agrega los JPanels al JFrame en las posiciones deseadas
        frame.add(panelIzquierda, BorderLayout.WEST);
        frame.add(panelCentro, BorderLayout.CENTER);
        frame.add(panelDerecha, BorderLayout.EAST);

        panelIzquierda.setPreferredSize(new Dimension(200, 400));
        panelCentro.setPreferredSize(new Dimension(400, 400));
        panelDerecha.setPreferredSize(new Dimension(200, 400));


        // Configura el tamaño y operación de cierre del JFrame
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
