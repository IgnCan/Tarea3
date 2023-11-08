import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDispensador extends JPanel {
    public PanelDispensador(){
        super();
        setBackground(Color.PINK);
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();

        p1.setLayout(new GridLayout(5,1));


        JButton botoncoca = new JButton("Cocacola");
        p1.add(botoncoca);
        botoncoca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                System.out.println("CocaCola");
                repaint();
            }
        });

        JButton botonsprite = new JButton("Sprite");
        p1.add(botonsprite);
        botonsprite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                System.out.println("Sprite");
                repaint();
            }
        });

        JButton botonfanta = new JButton("Fanta");
        p1.add(botonfanta);
        botonfanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                System.out.println("Fanta");
                repaint();
            }
        });

        JButton botonsuper8 = new JButton("Super8");
        p1.add(botonsuper8);
        botonsuper8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                System.out.println("Super8");
                repaint();
            }
        });

        JButton botonsnikers = new JButton("Snikers");
        p1.add(botonsnikers);
        botonsnikers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                System.out.println("Snikers");
                repaint();
            }
        });
        JButton Comprar= new JButton("Comprar");
        add(Comprar);
        botonsnikers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                System.out.println("Compra realizada");
                repaint();
            }
        });


//        //Aca defino una forma base para cada jBoton (cuadrado de 100x100)
//        Dimension buttonSize = new Dimension(70, 70);
//
//        //Aca los organizo
//        p1.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//
//        //Da un especiado de 10p entre cada boton
//        gbc.insets = new Insets(50, 0, 0, 0);
//
//        gbc.gridx = 0; // Columna 0
//
//        gbc.gridy = 0; // Fila 0
//        p1.add(botoncoca,gbc);
//        botoncoca.setPreferredSize(buttonSize);
//
//        gbc.gridy = 1; // Fila 1
//        p1.add(botonsprite,gbc);
//        botonsprite.setPreferredSize(buttonSize);
//
//        gbc.gridy = 2; // Fila 2
//        p1.add(botonfanta,gbc);
//        botonfanta.setPreferredSize(buttonSize);

//        gbc.gridy = 3; // Fila 3
//        p1.add(botonsuper8,gbc);
//        botonsuper8.setPreferredSize(buttonSize);

//        gbc.gridy = 2; // Fila 2
//        p1.add(botonfanta,gbc);
//        botonfanta.setPreferredSize(buttonSize);
    }
}
