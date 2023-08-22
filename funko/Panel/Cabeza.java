package Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Cabeza extends JPanel {

    private JButton botonMarvel;
    private JButton botonCambiarDC;
    private JButton botonOk;
    private JLabel etiqueta;
    private ArrayList<ImageIcon> Marvel;
    private ArrayList<ImageIcon> DC;
    private int imagenActualIndex = 0;
    public int pCabeza = 0;

    public Cabeza() {
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
                Tronco.crearPanel2();
            }
        });

        etiqueta = new JLabel("Elige Tu cabeza Favorita.");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);

        Marvel = new ArrayList<>();
        Marvel.add(new ImageIcon("Imagenes/Marvel/Cabeza/1.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Cabeza/2.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Cabeza/3.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Cabeza/4.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Cabeza/5.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Cabeza/6.jpg"));

        DC = new ArrayList<>();
        DC.add(new ImageIcon("Imagenes/Dc/Cabeza/1.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Cabeza/2.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Cabeza/3.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Cabeza/4.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Cabeza/5.jpg"));


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
        pCabeza = imagenActualIndex;
        System.out.println("Imagenes/Marvel/Cabeza/" + pCabeza + ".jpg");
    }
    
    private void cambiarImagenD() {
        imagenActualIndex = (imagenActualIndex + 1) % DC.size();
        ((JLabel) getComponent(2)).setIcon(DC.get(imagenActualIndex));
        pCabeza = imagenActualIndex;
        System.out.println("Imagenes/Dc/Cabeza/" + pCabeza + ".jpg");
    }

    public static void crearPanel2() {
        JFrame frame = new JFrame("CREACION FUNKO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Cabeza panel = new Cabeza();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(500, 400));
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
