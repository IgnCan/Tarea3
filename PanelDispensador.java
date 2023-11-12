import ExcepcionesPropias.NoHayProductoException;
import ExcepcionesPropias.PagoIncorrectoException;
import ExcepcionesPropias.PagoInsuficienteException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * PanelDispensador sublcase de JPanel, aca se ejecutara todo el proceso de compra, tiene las siguientes propiedades:
 * Moneda MonEnDisp - una moneda nula que se definira cuando llegue desde PanelMonedas
 * Comprador c - Comprador nulo que se definira una vez seleccionado el producto.
 * Expendedor exp - expendedor que se inicializa con el JPanel, aca se define que cantidad de productos tiene el dispensador al inicio.
 * PanelListener panelListener - para el envio de datos entre paneles.
 * JBotones para todos los elementos que estaran en venta.
 * Jlabels que indicaran vuelto, cuantos productos quedan y el producto vendido.
 * ActivarBotonesListener activarBotonesListener que ayuda tambien al envio de datos entre paneles por eventos.
 */
public class PanelDispensador extends JPanel {
    private Moneda MonEnDisp = null;
    private Comprador c = null;
    private Expendedor exp = new Expendedor(3);
    private PanelListener panelListener;
    private JLabel label = new JLabel(String.valueOf(exp.cocaTamaño()));
    private JLabel labelc=new JLabel(new PanelConImagenes("cocacola",50).getIcon());
    private JButton botoncoca = new JButton("Coca-Cola : $300");
    private JLabel label2 = new JLabel(String.valueOf(exp.spriteTamaño()));
    private JLabel labels=new JLabel(new PanelConImagenes("sprite",50).getIcon());
    private JButton botonsprite = new JButton("Sprite : $1000");
    private JLabel label3 = new JLabel(String.valueOf(exp.fantaTamaño()));
    private JLabel labelf=new JLabel(new PanelConImagenes("Fanta",50).getIcon());
    private JButton botonfanta = new JButton("Fanta : $600");
    private JLabel label4 = new JLabel(String.valueOf(exp.super8Tamaño()));
    private JLabel labelsu=new JLabel(new PanelConImagenes("Super8",50).getIcon());
    private JButton botonsuper8 = new JButton("Super8 : $700 ");
    private JLabel label5 = new JLabel(String.valueOf(exp.snickersTamaño()));
    private JLabel labelsn=new JLabel(new PanelConImagenes("Snikers",50).getIcon());
    private JButton botonsnikers = new JButton("Snikers : $500");
    private JLabel labelCompra = new JLabel("Compra");
    private JLabel vuelto = new JLabel("Vuelto");

    private ActivarBotonesListener activarBotonesListener;

    /**
     * Constructor del panel dispensador, se definen la posicion de los botones y sus acciones.
     * Los JBotones ejecutaran un intento de compra cuando son presionados los datos de la comra (exitoso o no) se enviaran al panel comprador donde se veran los resultados al mismo tiempo, reactivara los botones en PanelMonedas para permitir intentar otra compra y seguir un ciclo donde se puedan realizar varias compras seguidas en una misma ejecucion del main.
     * @param listener Sirve para enviar datos a PanelComprador y terminar el proceso de compra.
     * @throws NoHayProductoException
     * @throws PagoInsuficienteException
     * @throws PagoIncorrectoException
     */
    public PanelDispensador(PanelListener listener) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        super();

        setBackground(Color.PINK);

        //Aca defino una forma base para cada jBoton de 100x60
        Dimension buttonSize = new Dimension(400, 800);
        Dimension labelSize = new Dimension(20, 20);
        Dimension bebidaSize = new Dimension(5, 5);

        Font font = new Font("Arial", Font.BOLD, 14); // Puedes ajustar la familia de la fuente, estilo y tamaño
        botoncoca.setFont(font);
        botonsprite.setFont(font);
        botonfanta.setFont(font);
        botonsuper8.setFont(font);
        botonsnikers.setFont(font);
        vuelto.setFont(font);
        labelCompra.setFont(font);


        //Aca los organizo
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Da un especiado de 10p entre cada boton
        gbc.insets = new Insets(15, 0, 0, 10);

        gbc.gridx = 0; // Columna 0


        gbc.gridy = 1; // Fila 0
        add(labelc, gbc);
        labelc.setPreferredSize(bebidaSize);

        gbc.gridy = 2; // Fila 2
        add(labels, gbc);
        labels.setPreferredSize(bebidaSize);

        gbc.gridy = 3; // Fila 3
        add(labelf, gbc);
        labelf.setPreferredSize(bebidaSize);

        gbc.gridy = 4; // Fila 4
        add(labelsu, gbc);
        labelsu.setPreferredSize(bebidaSize);

        gbc.gridy = 5; // Fila 0
        add(labelsn, gbc);
        labelsn.setPreferredSize(bebidaSize);

        gbc.gridx = 2; // Columna 1

        gbc.gridy = 1; // Fila 0
        add(botoncoca, gbc);
        botoncoca.setPreferredSize(buttonSize);

        gbc.gridy = 2; // Fila 1
        add(botonsprite, gbc);
        botonsprite.setPreferredSize(buttonSize);

        gbc.gridy = 3; // Fila 2
        add(botonfanta, gbc);
        botonfanta.setPreferredSize(buttonSize);

        gbc.gridy = 4; // Fila 1
        add(botonsuper8, gbc);
        botonsuper8.setPreferredSize(buttonSize);

        gbc.gridy = 5; // Fila 2
        add(botonsnikers, gbc);
        botonsnikers.setPreferredSize(buttonSize);
        gbc.gridy = 9; // Fila 5
        add(labelCompra, gbc);
        labelCompra.setPreferredSize(buttonSize);

        gbc.gridx = 3; // Columna 2

        gbc.gridy = 1; // Fila 1
        add(label, gbc);
        label.setPreferredSize(labelSize);

        gbc.gridy = 2; // Fila 2
        add(label2, gbc);
        label2.setPreferredSize(labelSize);

        gbc.gridy = 3; // Fila 3
        add(label3, gbc);
        label3.setPreferredSize(labelSize);

        gbc.gridy = 4; // Fila 1
        add(label4, gbc);
        label4.setPreferredSize(labelSize);

        gbc.gridy = 5; // Fila 2
        add(label5, gbc);
        label5.setPreferredSize(labelSize);

        gbc.gridy = 6; // Fila 2
        JLabel aa = new JLabel("   ");
        add(aa, gbc);
        aa.setPreferredSize(buttonSize);

        gbc.gridy = 7; // Fila 2
        aa = new JLabel("   ");
        add(aa, gbc);
        aa.setPreferredSize(buttonSize);


        gbc.gridy = 9; // Fila 5
        add(vuelto, gbc);
        vuelto.setPreferredSize(labelSize);

        this.panelListener = listener;

        botoncoca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    c = new Comprador(MonEnDisp, 1, exp);
                    System.out.println("Producto con serie: "+ c.getProdSerie());
                    label.setText(String.valueOf(exp.cocaTamaño()));
                    vuelto.setText(String.valueOf(c.cuantoVuelto()));
                    labelCompra.setText(c.queBebiste());
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            MonEnDisp = null;
                            panelListener.onObjectReceived(c);
                            vuelto.setText("");
                            labelCompra.setText("");
                            if (activarBotonesListener != null) {
                                activarBotonesListener.activarBotones();
                            }
                            ((Timer) evt.getSource()).stop();
                        }
                    });
                    timer.setRepeats(false); // Evitar que el temporizador se repita
                    timer.start();

                } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });
        botonsprite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    c = new Comprador(MonEnDisp, 2, exp);
                    System.out.println("Producto con serie: "+ c.getProdSerie());
                    label2.setText(String.valueOf(exp.spriteTamaño()));
                    vuelto.setText(String.valueOf(c.cuantoVuelto()));
                    labelCompra.setText(c.queBebiste());
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            MonEnDisp = null;
                            panelListener.onObjectReceived(c);
                            vuelto.setText("");
                            labelCompra.setText("");
                            if (activarBotonesListener != null) {
                                activarBotonesListener.activarBotones();
                            }
                            ((Timer) evt.getSource()).stop();
                        }
                    });
                    timer.setRepeats(false); // Evitar que el temporizador se repita
                    timer.start();
                } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        botonfanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    c = new Comprador(MonEnDisp, 3, exp);
                    System.out.println("Producto con serie: "+ c.getProdSerie());
                    label3.setText(String.valueOf(exp.fantaTamaño()));
                    vuelto.setText(String.valueOf(c.cuantoVuelto()));
                    labelCompra.setText(c.queBebiste());
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            MonEnDisp = null;
                            panelListener.onObjectReceived(c);
                            vuelto.setText("");
                            labelCompra.setText("");
                            if (activarBotonesListener != null) {
                                activarBotonesListener.activarBotones();
                            }
                            ((Timer) evt.getSource()).stop();
                        }
                    });
                    timer.setRepeats(false); // Evitar que el temporizador se repita
                    timer.start();
                } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        botonsuper8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    c = new Comprador(MonEnDisp, 4, exp);
                    System.out.println("Producto con serie: "+ c.getProdSerie());
                    label4.setText(String.valueOf(exp.super8Tamaño()));
                    vuelto.setText(String.valueOf(c.cuantoVuelto()));
                    labelCompra.setText(c.queBebiste());
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            MonEnDisp = null;
                            panelListener.onObjectReceived(c);
                            vuelto.setText("");
                            labelCompra.setText("");
                            if (activarBotonesListener != null) {
                                activarBotonesListener.activarBotones();
                            }
                            ((Timer) evt.getSource()).stop();
                        }
                    });
                    timer.setRepeats(false); // Evitar que el temporizador se repita
                    timer.start();
                } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        botonsnikers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    c = new Comprador(MonEnDisp, 5, exp);
                    System.out.println("Producto con serie: "+ c.getProdSerie());
                    label5.setText(String.valueOf(exp.snickersTamaño()));
                    vuelto.setText(String.valueOf(c.cuantoVuelto()));
                    labelCompra.setText(c.queBebiste());
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            MonEnDisp = null;
                            panelListener.onObjectReceived(c);
                            vuelto.setText("");
                            labelCompra.setText("");
                            if (activarBotonesListener != null) {
                                activarBotonesListener.activarBotones();
                            }
                            ((Timer) evt.getSource()).stop();
                        }
                    });
                    timer.setRepeats(false); // Evitar que el temporizador se repita
                    timer.start();
                } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    /**
     * Recibe el objeto enviado desde PanelMonedas, asi puede ser ingresado al dispensador.
     * @param monEnviada Es la recibida
     */
    public void recibirObjeto(Moneda monEnviada) {
        MonEnDisp = monEnviada;

    }
    /**
     * Metodo que escucha cuando un JBoton de este panel fue presionado y reactiva los botones del PanelMonedas
     * @param listener Es la escucha del evento
     */
    public void addActivarBotonesListener(ActivarBotonesListener listener) {
        this.activarBotonesListener = listener;
    }
}
