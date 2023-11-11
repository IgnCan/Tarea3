import javax.swing.*;
import java.awt.*;

public class PanelConImagenes extends JLabel {
    JLabel Etiqueta;
    public PanelConImagenes(int i) {

        switch (i){
            case 1:{
            ImageIcon imagen1 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\cocacola.jpg\"");
            Etiqueta = new JLabel(imagen1);


            }
            case 2:{
                ImageIcon imagen2 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\Sprite.jpg\"");
                Etiqueta = new JLabel(imagen2);

            }
            case 3:{
                ImageIcon imagen3 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\fanta.jpg\"");
                Etiqueta= new JLabel(imagen3);

            }
            case 4:{
                ImageIcon imagen4 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\super8.jpg\"");
                Etiqueta= new JLabel(imagen4);

            }
            case 5:{
                ImageIcon imagen5 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\snikers.jpg\"");
                Etiqueta = new JLabel(imagen5);


        }
            Dimension LABELZISE = new Dimension(100, 100);
            Etiqueta.setPreferredSize(LABELZISE);

      }
    }
}

//public class JLabelConImagen extends JFrame {
//    public JLabelConImagen() {
//        // Cargar la imagen desde un archivo (asegúrate de tener la ruta correcta)
//        ImageIcon icono = new ImageIcon("ruta/de/la/imagen.jpg");
//
//        // Escalar la imagen si es necesario
//        Image imagen = icono.getImage();
//        Image nuevaImagen = imagen.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
//        icono = new ImageIcon(nuevaImagen);
//
//        // Crear el JLabel y establecer el ImageIcon
//        JLabel label = new JLabel(icono);
//
//        // Agregar el JLabel al JFrame
//        add(label);
//
//        // Configurar el JFrame
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(300, 300);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new JLabelConImagen();
//    }
//}