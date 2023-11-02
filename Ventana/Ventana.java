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

        // Establece las posiciones de los JPaneles
        add(monedas,BorderLayout.WEST);
        add(dispensador,BorderLayout.CENTER);
        add(comprador,BorderLayout.EAST);

        //Establece el tamaño de los JPaneles
        monedas.setPreferredSize(new Dimension(300, 400));
        dispensador.setPreferredSize(new Dimension(400, 400));
        comprador.setPreferredSize(new Dimension(300, 400));

        //Aca se crea cada jBoton
        JButton mon100 = new Boton100peso();
        JButton mon500 = new JButton("Botón m500");
        JButton mon1000 = new JButton("Botón m1000");

        //Aca defino una forma base para cada jBoton (cuadrado de 100x100)
        Dimension buttonSize = new Dimension(100, 100);

        //Aca los organizo
        monedas.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Da un especiado de 10p entre cada boton
        gbc.insets = new Insets(50, 0, 0, 0);

        gbc.gridx = 0; // Columna 0

        gbc.gridy = 0; // Fila 0
        monedas.add(mon100,gbc);
        mon100.setPreferredSize(buttonSize);

        gbc.gridy = 1; // Fila 0
        monedas.add(mon500,gbc);
        mon500.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 0
        monedas.add(mon1000,gbc);
        mon1000.setPreferredSize(buttonSize);

    }

}
