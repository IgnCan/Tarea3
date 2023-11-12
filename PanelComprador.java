import javax.swing.*;
import java.awt.*;
import java.util.EventObject;
import java.awt.event.AWTEventListener;
/**
 * Clase PanelComprador que extiende a JPanel e imprementa el PanelListener, es el encargado de mostrar el producto recibido y el vuelto de la compra, tiene las siguientes propiedades:
 * Dos JLabel que mostraran el producto recibido y el vuelto de la compra
 * Un objeto comprador que sera modificado cuando lleguen los datos de PanelDispensador.
 */
public class PanelComprador extends JPanel implements PanelListener {
    private Comprador Compra= null;
    private JLabel label= new JLabel("Aca va el producto");
    private JLabel label3 = new JLabel("Aca va el vuelto");
    /**
     * Constructor, encargado de posicionar los JLabel en el lugar correcto y con el tamaño adecuado.
     */
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
        //label.setOpaque(true);
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
    /**
     * Metodo que recibe el objeto Comprador desde PanelDispensador, asi este panel nos podra decir que compro y cuanto vuelto obtuvo.
     * @param objeto Es el objeto comprador que viene desde PanelDispensador.
     */
    public void onObjectReceived(Comprador objeto) {
        Compra = objeto;
        try {
            PanelConImagenes pp = new PanelConImagenes(Compra.queBebiste(),100);
            label.setIcon(pp.getIcon());
        } catch (Exception a) {
            PanelConImagenes pp = new PanelConImagenes("nulo",100);
            label.setIcon(pp.getIcon());
        }
        label3.setText(String.valueOf(Compra.cuantoVuelto()));
        System.out.println("*************Objeto recibido en comprador: " + objeto.cuantoVuelto());
    }


}
