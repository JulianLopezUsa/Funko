package Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Piernas extends JPanel {

    private JButton botonMarvel;
    private JButton botonCambiarDC;
    private JButton botonOk;
    private JLabel etiqueta;
    private ArrayList<ImageIcon> Marvel;
    private ArrayList<ImageIcon> DC;
    private int imagenActualIndex = 0;

    public Piernas() {
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
        botonOk = new JButton("Guardar");
        botonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelFinal.PanelFinal1();
            }
        });

        etiqueta = new JLabel("Elige las piernas favoritas.");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);

        Marvel = new ArrayList<>();
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/1.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/2.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/3.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/4.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/5.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/6.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/7.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/8.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Marvel/Piernas/9.jpg"));

        DC = new ArrayList<>();
        DC.add(new ImageIcon("Imagenes/Dc/Piernas/1.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Piernas/2.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Piernas/3.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Piernas/4.jpg"));
        DC.add(new ImageIcon("Imagenes/Dc/Piernas/5.jpg"));

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

        Piernas panel = new Piernas();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(500, 400));
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
