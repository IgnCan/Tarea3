import javax.swing.*;
import java.awt.*;

public class PanelConImagenes{
    ImageIcon I;

    public PanelConImagenes(String a) {

        switch (a){
            case "cocacola":{
                I = new ImageIcon("C:\Users\snmar\Downloads\cocacola.jpg");

            }
            case "sprite":{
                I = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\Sprite.jpg\"");


            }
            case "Fanta":{
                I = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\fanta.jpg\"");

            }
            case "Super8":{
                I = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\super8.jpg\"");


            }
            case "Sniker":{
                I = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\snikers.jpg\"");


        }

      }

    }
    public ImageIcon getIcon(){
        return I;
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