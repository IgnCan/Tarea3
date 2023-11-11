import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDispensador extends JPanel {

    private Moneda MonEnDisp = null;
    Comprador c = null;
    private Expendedor exp = new Expendedor(1);



    JLabel label = new JLabel(String.valueOf(exp.cocaTamaño()));
    JButton botoncoca = new botoncoca();
    JLabel label2 = new JLabel(String.valueOf(exp.spriteTamaño()));
    JButton botonsprite = new JButton("Sprite");
    JLabel label3 = new JLabel(String.valueOf(exp.fantaTamaño()));
    JButton botonfanta = new JButton("Fanta");
    JLabel label4 = new JLabel(String.valueOf(exp.super8Tamaño()));
    JButton botonsuper8 = new JButton("Super8");
    JLabel label5 = new JLabel(String.valueOf(exp.snickersTamaño()));
    JButton botonsnikers = new JButton("Snikers");
    JLabel labelCompra = new JLabel("Aca sale la compra");
    JLabel vuelto = new JLabel("De aca saldra el vuelto");

    public PanelDispensador(PanelComprador comprador) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        super();
        setBackground(Color.PINK);

//        botoncoca.addActionListener(new ActionListener()  {
//            @Override
//            public void actionPerformed(ActionEvent e)  {
//                System.out.println("Apretaste el boton");
//                    c = new Comprador(MonEnDisp, 1, exp);
//                    System.out.println(c.queBebiste());
//                    label.setText(String.valueOf(exp.cocaTamaño()));
//                    vuelto.setText(exp.getVuelto().toString());
//
//
//            }
//
//        });
        botonsprite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sprite");
                try {
                    c = new Comprador(MonEnDisp, 2, exp);
                    System.out.println(c.queBebiste());
                    label2.setText(String.valueOf(exp.cocaTamaño()));
                    vuelto.setText(exp.getVuelto().toString());

                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        botonfanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fanta");
                try {
                    c = new Comprador(MonEnDisp, 3, exp);
                    System.out.println(c.queBebiste());
                    label3.setText(String.valueOf(exp.cocaTamaño()));
                    comprador.recepcionProducto(c.queCompra());
                    vuelto.setText(exp.getVuelto().toString());


                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        botonsuper8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Super8");
                try {
                    c = new Comprador(MonEnDisp, 4, exp);
                    System.out.println(c.queBebiste());
                    label4.setText(String.valueOf(exp.cocaTamaño()));
                    vuelto.setText(exp.getVuelto().toString());

                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        botonsnikers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Snikers");
                try {
                    c = new Comprador(MonEnDisp, 5, exp);
                    System.out.println(c.queBebiste());
                    label5.setText(String.valueOf(exp.cocaTamaño()));
                    vuelto.setText(exp.getVuelto().toString());

                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        //Aca defino una forma base para cada jBoton de 100x60
        Dimension buttonSize = new Dimension(75, 50);
        Dimension labelSize = new Dimension(30, 30);


        //Aca los organizo
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Da un especiado de 10p entre cada boton
        gbc.insets = new Insets(0, 0, 0, 10);

        gbc.gridx = 0; // Columna 0

        gbc.gridy = 1; // Fila 0
        add(botoncoca, gbc);
        botoncoca.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 1
        add(botonsprite, gbc);
        botonsprite.setPreferredSize(buttonSize);

        gbc.gridy = 3; // Fila 2
        add(botonfanta, gbc);
        botonfanta.setPreferredSize(buttonSize);


        gbc.gridx = 1; // Columna 1

        gbc.gridy = 1; // Fila 1
        add(label, gbc);
        label.setPreferredSize(labelSize);

        gbc.gridy = 2; // Fila 2
        add(label2, gbc);
        label2.setPreferredSize(labelSize);

        gbc.gridy = 3; // Fila 3
        add(label3, gbc);
        label3.setPreferredSize(labelSize);


        gbc.gridx = 3; // Columna 3

        gbc.gridy = 1; // Fila 1
        add(botonsuper8, gbc);
        botonsuper8.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 2
        add(botonsnikers, gbc);
        botonsnikers.setPreferredSize(buttonSize);

        gbc.gridy = 4; // Fila 2
        JLabel aa = new JLabel("   ");
        add(aa, gbc);
        aa.setPreferredSize(buttonSize);

        gbc.gridy = 7; // Fila 5
        add(labelCompra, gbc);
        labelCompra.setPreferredSize(buttonSize);


        gbc.gridx = 4; // Columna 4

        gbc.gridy = 1; // Fila 1
        add(label4, gbc);
        label4.setPreferredSize(labelSize);

        gbc.gridy = 2; // Fila 2
        add(label5, gbc);
        label5.setPreferredSize(labelSize);

        gbc.gridy = 4; // Fila 2
        add(aa, gbc);
        aa.setPreferredSize(buttonSize);


        gbc.gridy = 7; // Fila 5
        add(vuelto, gbc);
        vuelto.setPreferredSize(buttonSize);

    }

    public void recibirObjeto(Moneda monEnviada) {
        MonEnDisp = monEnviada;
        System.out.println("Objeto recibido en Dispensador: " + MonEnDisp.getValor());
    }

    public class botoncoca extends JButton {
        public botoncoca() {
            super();
            this.setText("CocaCola");
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Apretaste el boton");
                    try {
                        c = new Comprador(MonEnDisp, 1, exp);
                        System.out.println(c.queBebiste());
                        System.out.println(c.cuantoVuelto());
                        label.setText(String.valueOf(exp.cocaTamaño()));
                        vuelto.setText(String.valueOf(c.cuantoVuelto()));
                        // 
                        //
                    } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            });

        }
    }



}
