package vista;

import controlador.Contador;

import javax.swing.*;

public class Boton extends JFrame {

    public void contar() {
        JFrame mainFrame = new JFrame("Contador");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Contador contador = new Contador(mainFrame);

        contador.click();

        mainFrame.setBounds(80, 60, 300, 150);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

}