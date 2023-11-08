import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Por orden haremos el boton a parte a ver que onda
public class Boton1000peso extends JButton {
    public Boton1000peso(){
        super();
        //Esto agrega el texto
        this.setText("1000 peso");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Moneda1000 m = new Moneda1000();
                System.out.println(m.getValor());
            }
        });
    }
}