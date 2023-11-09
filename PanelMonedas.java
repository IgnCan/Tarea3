import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMonedas extends JPanel {
    JButton mon100 = new JButton("$ 100");
    JButton mon500 = new JButton("$ 500");
    JButton mon1000 = new JButton("$ 1000");




    Moneda m;

    public PanelMonedas(){
        super();
        setBackground(Color.DARK_GRAY);

        mon100.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  m = new Moneda100();
                  System.out.println(m.getValor());
              }
          });
        mon500.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Moneda500();
                System.out.println(m.getValor());
            }
        });

        mon1000.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                Moneda1000 m = new Moneda1000();
                System.out.println(m.getValor());
            }
        });


        //Aca defino una forma base para cada jBoton (cuadrado de 100x100)
        Dimension buttonSize = new Dimension(100, 100);

        //Aca los organizo
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Da un especiado de 10p entre cada boton
        gbc.insets = new Insets(50, 0, 0, 0);

        gbc.gridx = 0; // Columna 0

        gbc.gridy = 0; // Fila 0
        add(mon100,gbc);
        mon100.setPreferredSize(buttonSize);

        gbc.gridy = 1; // Fila 1
        add(mon500,gbc);
        mon500.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 2
        add(mon1000,gbc);
        mon1000.setPreferredSize(buttonSize);


    }

    public Moneda getM() {
        return m;
    }
    //    public class Boton100peso extends JButton {
//
//        public Boton100peso() {
//            super();
//            this.setText("100 peso");
//            addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    Moneda100 m = new Moneda100();
//
//                    System.out.println(m.getValor());
//
//
//                }
//            });
//        }
//    }
//
//    public class Boton500peso extends JButton {
//        public Boton500peso(Moneda m){
//            super();
//            //Esto agrega el texto
//            this.setText("500 peso");
//
//        }
//    }
//
//    public class Boton1000peso extends JButton {
//        public Boton1000peso(){
//            super();
//            //Esto agrega el texto
//            this.setText("1000 peso");
//
//        }
//    }
}
