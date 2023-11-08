import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador(){
        super();
        setBackground(Color.CYAN);
        setLayout(new GridBagLayout());

        Dimension LABELZISE = new Dimension(100, 100);

        JLabel label = new JLabel("hola");

        JLabel label3 = new JLabel("chao");

        GridBagConstraints labelConstraints = new GridBagConstraints();

        labelConstraints.gridx = 0;

        labelConstraints.gridy = 0;
        label.setPreferredSize(LABELZISE);
        add(label,labelConstraints);

        labelConstraints.gridy = 1;
        label3.setPreferredSize(LABELZISE);
        add(label3,labelConstraints);
    }
}
