import javax.swing.SwingUtilities;

import Panel.Panel;

class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Panel.crearYMostrarGUI();
            }
        });
    }

}
