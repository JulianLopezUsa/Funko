package Panel;

import javax.swing.*;
import java.awt.*;

public class PanelFinal extends JFrame {

    public PanelFinal() {

        setTitle("Resultado Final");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());

        ImageIcon image1 = new ImageIcon("Imagenes/Dc/Cabeza/2.jpg");
        ImageIcon image3 = new ImageIcon("Imagenes/Dc/Piernas/5.jpg");
        ImageIcon image2 = new ImageIcon("Imagenes/Dc/Tronco/3.jpg");

        JLabel label1 = new JLabel(image1);
        JLabel label2 = new JLabel(image2);
        JLabel label3 = new JLabel(image3);

        mainPanel.add(label1, BorderLayout.NORTH);
        mainPanel.add(label2, BorderLayout.CENTER);
        mainPanel.add(label3, BorderLayout.SOUTH);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void PanelFinal1() {

        SwingUtilities.invokeLater(() -> new PanelFinal());
    }

}
