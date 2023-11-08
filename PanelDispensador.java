import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDispensador extends JPanel {
    public PanelDispensador(){
        super();
        setBackground(Color.PINK);
        JPanel p1=new JPanel();

        JLabel label= new JLabel("LabelCoca");

        JButton botoncoca = new JButton("Cocacola");
        //p1.add(botoncoca);
        botoncoca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
//                label.setText("");
                System.out.println("CocaCola");
//                repaint();
            }
        });

        JLabel label2= new JLabel("LabelSprite");

        JButton botonsprite = new JButton("Sprite");
        //p1.add(botonsprite);
        botonsprite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                JLabel label2= new JLabel("LabelCoca");
                System.out.println("Sprite");
                repaint();
            }
        });

        JLabel label3= new JLabel("LabelFanta");

        JButton botonfanta = new JButton("Fanta");
        //p1.add(botonfanta);
        botonfanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                JLabel label3= new JLabel("LabelCoca");
                System.out.println("Fanta");
                repaint();
            }
        });

        JLabel label4= new JLabel("LabelSpuer8");

        JButton botonsuper8 = new JButton("Super8");
        //p1.add(botonsuper8);
        botonsuper8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                JLabel label4= new JLabel("LabelCoca");
                System.out.println("Super8");
                repaint();
            }
        });

         JLabel label5= new JLabel("LabelSnikers");

        JButton botonsnikers = new JButton("Snikers");
        p1.add(botonsnikers);
        botonsnikers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                JLabel label5= new JLabel("LabelCoca");
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


        //Aca defino una forma base para cada jBoton de 100x60
        Dimension buttonSize = new Dimension(75, 50);
        Dimension labelSize = new Dimension(30, 30);


//        //Aca los organizo
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Da un especiado de 10p entre cada boton
        gbc.insets = new Insets(0, 0, 0, 10);

        gbc.gridx = 0; // Columna 0

        gbc.gridy = 1; // Fila 0
        add(botoncoca,gbc);
        botoncoca.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 1
        add(botonsprite,gbc);
        botonsprite.setPreferredSize(buttonSize);

        gbc.gridy = 3; // Fila 2
        add(botonfanta,gbc);
        botonfanta.setPreferredSize(buttonSize);

        gbc.gridy = 4; // Fila 3
        add(botonsuper8,gbc);
        botonsuper8.setPreferredSize(buttonSize);

        gbc.gridy = 5; // Fila 4
        add(botonsnikers,gbc);
        botonsnikers.setPreferredSize(buttonSize);

        gbc.gridx = 1; // Columna 1
        gbc.gridy = 3; // Fila 4
        add(Comprar,gbc);
        Comprar.setPreferredSize(buttonSize);

    }
}
