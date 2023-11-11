import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMonedas extends JPanel {
    JButton mon100 = new Boton100peso();
    JButton mon500 = new Boton500peso();
    JButton mon1000 = new Boton1000peso();
    public Moneda m = null;
    public PanelMonedas(PanelDispensador dispensador){
        super();
        setBackground(Color.DARK_GRAY);

        mon100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Moneda100();
                System.out.println(m.getValor());
                dispensador.recibirObjeto(m);
                for (Component component : getComponents()) {
                    if (component instanceof JButton) {
                        ((JButton) component).setEnabled(false);
                    }
                }
            }
        });


        mon500.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Moneda500();
                System.out.println(m.getValor());
                dispensador.recibirObjeto(m);
                for (Component component : getComponents()) {
                    if (component instanceof JButton) {
                        ((JButton) component).setEnabled(false);
                    }
                }
            }
        });

        mon1000.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Moneda1000();
                System.out.println(m.getValor());
                dispensador.recibirObjeto(m);
                for (Component component : getComponents()) {
                    if (component instanceof JButton) {
                        ((JButton) component).setEnabled(false);
                    }
                }

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

    public class Boton100peso extends JButton {
        public Boton100peso() {
            super();
            ImageIcon I = new ImageIcon("Imagenes/Moneda100.png");
            Image imagen = I.getImage();
            Image reescalado = imagen.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
            I= new ImageIcon(reescalado);
            this.setIcon(I);
            this.setContentAreaFilled(false);
        }
    }

    public class Boton500peso extends JButton {
        public Boton500peso(){
            super();
            ImageIcon I = new ImageIcon("Imagenes/Moneda500.png");
            Image imagen = I.getImage();
            Image reescalado = imagen.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
            I= new ImageIcon(reescalado);
            this.setIcon(I);
            this.setContentAreaFilled(false);
        }
    }

    /**
     *
     */
    public class Boton1000peso extends JButton {
        public Boton1000peso(){
            super();
            ImageIcon I = new ImageIcon("Imagenes/Moneda1000.png");
            Image imagen = I.getImage();
            Image reescalado = imagen.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
            I= new ImageIcon(reescalado);
            this.setIcon(I);
            this.setContentAreaFilled(false);
        }
    }
}

