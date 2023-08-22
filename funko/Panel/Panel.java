package Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel {

    private JButton boton;
    private JLabel etiqueta;
    private ImageIcon imagen;

    public Panel() {
        setLayout(new BorderLayout());

        boton = new JButton("Crear");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cabeza.crearPanel2();
            }
        });

        etiqueta = new JLabel("Bienvenido a Crear tu funk, con personajes del Marvel y Dc.");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);

        imagen = new ImageIcon("Imagenes/SignoInte.jpg");
        Image imagenEscalada = imagen.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
        JLabel etiquetaImagen = new JLabel(imagenEscaladaIcon);
        etiquetaImagen.setHorizontalAlignment(JLabel.CENTER);

        add(boton, BorderLayout.NORTH);
        add(etiqueta, BorderLayout.CENTER);
        add(etiquetaImagen, BorderLayout.SOUTH);
    }

    public static void crearYMostrarGUI() {
        JFrame frame = new JFrame("CREACION DE FUNKO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(600, 400)); // Ajusta el tamaño del JPanel
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
