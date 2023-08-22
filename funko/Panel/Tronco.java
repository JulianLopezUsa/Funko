package Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Tronco extends JPanel {

    private JButton botonMarvel;
    private JButton botonCambiarDC;
    private JButton botonOk;
    private JLabel etiqueta;
    private ArrayList<ImageIcon> Marvel;
    private ArrayList<ImageIcon> DC;
    private int imagenActualIndex = 0;

    public Tronco() {
        panelImagen();
    }

    public void panelImagen() {
        setLayout(new BorderLayout());

        botonMarvel = new JButton("MARVEL");
        botonMarvel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarImagenM();
            }
        });

        botonCambiarDC = new JButton("DC");
        botonCambiarDC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarImagenD();
            }
        });
        botonOk = new JButton("Continuar");
        botonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Piernas.crearPanel2();
            }
        });

        etiqueta = new JLabel("Elige el tronco favorito.");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);

        Marvel = new ArrayList<>();
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/1.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/2.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/3.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/4.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/5.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/6.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/7.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/8.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/9.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/10.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Tronco/11.jpg"));

        DC = new ArrayList<>();
        DC.add(new ImageIcon("Imagenes/Dc/Tronco/1.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Tronco/2.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Tronco/3.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Tronco/4.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Tronco/5.jpg"));

        JLabel etiquetaImagen = new JLabel(Marvel.get(imagenActualIndex));
        etiquetaImagen.setHorizontalAlignment(JLabel.CENTER);

        JPanel botonesPanel = new JPanel();
        botonesPanel.add(botonMarvel);
        botonesPanel.add(botonCambiarDC);
        botonesPanel.add(botonOk);

        add(botonesPanel, BorderLayout.NORTH);
        add(etiqueta, BorderLayout.CENTER);
        add(etiquetaImagen, BorderLayout.SOUTH);
    }

    private void cambiarImagenM() {
        imagenActualIndex = (imagenActualIndex + 1) % Marvel.size();
        ((JLabel) getComponent(2)).setIcon(Marvel.get(imagenActualIndex));
    }

    private void cambiarImagenD() {
        imagenActualIndex = (imagenActualIndex + 1) % DC.size();
        ((JLabel) getComponent(2)).setIcon(DC.get(imagenActualIndex));
    }

    public static void crearPanel2() {
        JFrame frame = new JFrame("CREACION FUNKO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Tronco panel = new Tronco();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(500, 400));
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
