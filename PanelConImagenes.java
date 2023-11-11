import javax.swing.*;
import java.awt.*;

public class PanelConImagenes{
    ImageIcon I;

    public PanelConImagenes(String a) {

        switch (a){
            case "cocacola":{
                I = new ImageIcon("Imagenes/cocacola.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;

            }
            case "sprite":{
                I = new ImageIcon("Imagenes/Sprite.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;


            }
            case "Fanta":{
                I = new ImageIcon("Imagenes/fanta.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;

            }
            case "Super8":{
                I = new ImageIcon("Imagenes/super8.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;

            }
            case "Sniker":{
                I = new ImageIcon("Imagenes/snikers.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;

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