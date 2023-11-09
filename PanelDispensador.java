import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDispensador extends JPanel {
    Producto p;
    int cc=10000;
    int sp=20000;
    int f=30000;
    int su=40000;
    int sn=50000;
    Moneda a;
    Expendedor exp = new Expendedor(1);
    public PanelDispensador(){
        super();
        setBackground(Color.PINK);

        JLabel label= new JLabel("LabelCoca");
        JButton botoncoca = new JButton("Cocacola");
        JLabel label2= new JLabel("LabelSprite");
        JButton botonsprite = new JButton("Sprite");
        JLabel label3= new JLabel("LabelFanta");
        JButton botonfanta = new JButton("Fanta");
        JLabel label4= new JLabel("LabelSpuer8");
        JButton botonsuper8 = new JButton("Super8");
        JLabel label5= new JLabel("LabelSnikers");
        JButton botonsnikers = new JButton("Snikers");
        JLabel labelCompra = new JLabel("Aca sale la compra");
        JLabel vuelto = new JLabel("De aca saldra el vuelto");



        botoncoca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("CocaCola");
                cc=cc+1;
                p=new CocaCola(cc);
                Comprador c= null;
                try {
                    c = new Comprador(a,cc, exp);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
            }
        });
        botonsprite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sprite");
                sp=sp+1;
                p=new Sprite(sp);
                Comprador c= null;
                try {
                    c = new Comprador(a,sp, exp);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            }
        });
        botonfanta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fanta");
                f=f+1;
                p=new Fanta(f);
                Comprador c= null;
                try {
                    c = new Comprador(a,f, exp);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            }
        });
        botonsuper8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Super8");
                su=su+1;
                p=new Super8(su);
                Comprador c= null;
                try {
                    c = new Comprador(a,su, exp);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            }
        });
        botonsnikers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Snikers");
                sn=sn+1;
                p=new Snikers(sn);
                Comprador c= null;
                try {
                    c = new Comprador(a,sn, exp);
                } catch (NoHayProductoException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoInsuficienteException ex) {
                    throw new RuntimeException(ex);
                } catch (PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

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


        gbc.gridx = 1; // Columna 1

        gbc.gridy = 1; // Fila 1
        add(label,gbc);
        label.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 2
        add(label2,gbc);
        label2.setPreferredSize(buttonSize);

        gbc.gridy = 3; // Fila 3
        add(label3,gbc);
        label3.setPreferredSize(buttonSize);
        
        gbc.gridx = 3; // Columna 3

        gbc.gridy = 1; // Fila 1
        add(botonsuper8,gbc);
        botonsuper8.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 2
        add(botonsnikers,gbc);
        botonsnikers.setPreferredSize(buttonSize);

        gbc.gridy = 4; // Fila 2
        JLabel aa=new JLabel("   ");
        add(aa,gbc);
        aa.setPreferredSize(buttonSize);

        gbc.gridy = 7; // Fila 5
        add(labelCompra,gbc);
        labelCompra.setPreferredSize(buttonSize);




        gbc.gridx = 4; // Columna 4

        gbc.gridy = 1; // Fila 1
        add(label4,gbc);
        label4.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 2
        add(label5,gbc);
        label5.setPreferredSize(buttonSize);

        gbc.gridy = 4; // Fila 2
        add(aa,gbc);
        aa.setPreferredSize(buttonSize);


        gbc.gridy = 7; // Fila 5
        add(vuelto,gbc);
        vuelto.setPreferredSize(buttonSize);

    }

    public Producto getP() {
        return p;
    }

    public void settA(Moneda a) {
        this.a = a;
    }
}
