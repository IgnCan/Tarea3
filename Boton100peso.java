import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Por orden haremos el boton a parte a ver que onda
public class Boton100peso extends JButton {

    public Boton100peso(JPanel a){
        super();
        //Esto agrega el texto
        this.setText("100 peso");
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Moneda100 m = new Moneda100();
                System.out.println(m.getValor());

            }
        });

    }


}
