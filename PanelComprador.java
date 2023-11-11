import javax.swing.*;
import java.awt.*;
import java.util.EventObject;
import java.awt.event.AWTEventListener;

//        System.out.println(c.queBebiste());
//        System.out.println(c.cuantoVuelto());

public class PanelComprador extends JPanel implements PanelListener {
    private Comprador Compra= null;
    JLabel label= new JLabel("Aca va el producto");
    JLabel label3 = new JLabel("Aca va el vuelto");

    public PanelComprador() {
        super();
        setBackground(Color.CYAN);
        setLayout(new GridBagLayout());

        Dimension LABELZISE = new Dimension(100, 100);

        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.insets = new Insets(100,0,0,0);

        // Configurar el color de fondo (blanco) y el color de primer plano (negro) del JLabel
        label.setBackground(Color.WHITE);
        label.setForeground(Color.BLACK);

        label3.setBackground(Color.WHITE);
        label3.setForeground(Color.BLACK);

        // Habilitar la propiedad de opacidad para que el color de fondo sea visible
        label.setOpaque(true);
        label3.setOpaque(true);

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        labelConstraints.gridx = 0;

        labelConstraints.gridy = 0;
        label.setPreferredSize(LABELZISE);
        add(label,labelConstraints);

        labelConstraints.gridy = 1;
        label3.setPreferredSize(LABELZISE);
        add(label3,labelConstraints);


    }

//    public void recepcionProducto(Comprador compra) {
//        Compra = compra;
//        label.setText(Compra.toString());
//        System.out.println("Objeto recibido en comprador: ");
//        repaint();
//    }

    public void onObjectReceived(Comprador objeto) {
        // Manejar el objeto recibido en JPanelB
        Compra=objeto;
        try{
            ImageIcon pp =new PanelConImagenes(Compra.queBebiste()).getIcon();
            label=new JLabel(pp);
        } catch (Exception a){

        }
        label3.setText(String.valueOf(Compra.cuantoVuelto()));
        System.out.println("Objeto recibido en JPanelB: " + objeto.cuantoVuelto());
        label.repaint();

    }


}
