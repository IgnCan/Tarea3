import javax.swing.*;

public class PanelConImagenes extends JPanel {

    public PanelConImagenes() {


        // Cargar imágenes desde archivos (ajusta las rutas según sea necesario)
        ImageIcon imagen1 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\cocacola.jpg\"");
        ImageIcon imagen2 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\Sprite.jpg\"");
        ImageIcon imagen3 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\fanta.jpg\"");
        ImageIcon imagen4 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\super8.jpg\"");
        ImageIcon imagen5 = new ImageIcon("\"C:\\Users\\snmar\\Downloads\\snikers.jpg\"");


        // Crear etiquetasmostrar las imágenes
        JLabel etiqueta1 = new JLabel(imagen1);
        JLabel etiqueta2 = new JLabel(imagen2);
        JLabel etiqueta3 = new JLabel(imagen1);
        JLabel etiqueta4 = new JLabel(imagen2);
        JLabel etiqueta5 = new JLabel(imagen2);

        // Agregar las etiquetas al panel
        add(etiqueta1);
        add(etiqueta2);
    }
}