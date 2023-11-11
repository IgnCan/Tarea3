import javax.swing.*;
import java.awt.*;

public class PanelConImagenes{
    ImageIcon I;

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

        }

      }

    }
    public ImageIcon getIcon(){
        return I;
    }
}
