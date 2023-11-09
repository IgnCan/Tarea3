//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class pruebita {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Activar Botones desde Otro Panel");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel1 = new JPanel();
//        JButton boton1Panel1 = new JButton("Botón 1 (Panel 1)");
//        JButton boton2Panel1 = new JButton("Botón 2 (Panel 1)");
//        panel1.add(boton1Panel1);
//        panel1.add(boton2Panel1);
//
//        JPanel panel2 = new JPanel();
//        JButton activarBotonesButton = new JButton("Activar Botones");
//
//        // Agrega un ActionListener al botón de activación en panel2
//        activarBotonesButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Dispara un evento personalizado para activar los botones en panel1
//                ActivarBotonesEvent event = new ActivarBotonesEvent(this);
//                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(event);
//            }
//        });
//
//        panel2.add(activarBotonesButton);
//
//        frame.add(panel1, BorderLayout.NORTH);
//        frame.add(panel2, BorderLayout.SOUTH);
//
//        // Agrega un listener de eventos personalizados para activar los botones en panel1
//        Toolkit.getDefaultToolkit().getSystemEventQueue().push(new EventQueue() {
//            protected void dispatchEvent(AWTEvent event) {
//                if (event instanceof ActivarBotonesEvent) {
//                    PanelMonedas.Boton100peso.setEnabled(true);
//                    PanelMonedas.Boton500peso.setEnabled(true);
//                }
//                super.dispatchEvent(event);
//            }
//        });
//
//        frame.pack();
//        frame.setVisible(true);
//    }
//}
//
//class ActivarBotonesEvent extends AWTEvent {
//    public ActivarBotonesEvent(Object source) {
//        super(source, AWTEvent.RESERVED_ID_MAX + 1);
//    }
//}
