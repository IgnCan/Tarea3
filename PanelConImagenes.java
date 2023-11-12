import javax.swing.*;
import java.awt.*;

/**
 * Clase encargado de asignar los iconos a su respectivo JLabel al realizar una compra, tiene como propiedad un ImageIcon vacio.
 */
public class PanelConImagenes{
    private ImageIcon I;
    /**
     * Constructor encargado de asignar la imagen pedida, redimensionarla y asignarla a ImageIcon I
     * @param a recibe un String, este es el .queBebiste de un objeto Comprador
     * @param b es el tamaño que se le asignara a la imagen cuando sea redimensionada.
     */
    public PanelConImagenes(String a,int b) {

        switch (a){
            case "cocacola":{
                I = new ImageIcon("Imagenes/cocacola.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(b, b, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;
            }
            case "sprite":{
                I = new ImageIcon("Imagenes/Sprite.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(b, b, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;
            }
            case "Fanta":{
                I = new ImageIcon("Imagenes/fanta.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(b, b, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;
            }
            case "Super8":{
                I = new ImageIcon("Imagenes/super8.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(b, b, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;
            }
            case "Snikers":{
                I = new ImageIcon("Imagenes/snikers.jpg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(b, b, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;
        } default:
                I = new ImageIcon("Imagenes/blanco.jpeg");
                Image imagen = I.getImage();
                Image nuevaImagen = imagen.getScaledInstance(b, b, java.awt.Image.SCALE_SMOOTH);
                I= new ImageIcon(nuevaImagen);
                break;


      }
    }
    /**
     * Metodo que retorna el Icono que aparecera en PanelDispensador y PanelComprador al realizar una compra
     * @return I, un ImageIcon
     */
    public ImageIcon getIcon(){
        return I;
    }
}
