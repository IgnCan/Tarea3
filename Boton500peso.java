import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Por orden haremos el boton a parte a ver que onda
public class Boton500peso extends JButton {
    public Boton500peso(){
        super();
        //Esto agrega el texto
        this.setText("500 peso");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Moneda500 m = new Moneda500();
                System.out.println(m.getValor());
            }
        });
    }
}