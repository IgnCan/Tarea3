package Ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
//        Esto indica el ancho y largo respectivamente, recibe dos int
        this.setSize(500,500);

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

        Paneles();
    }

    private void Paneles(){
        //Crea el panel
        JPanel dispensador = new JPanel();
        dispensador.setBackground(Color.CYAN);
        this.getContentPane().add(dispensador);
    }

}
