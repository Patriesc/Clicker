package controlador;

import javax.swing.*;
import java.awt.*;

public class Contador  {
    private JFrame mainFrame;
    private int clickCount;

    public Contador(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void click() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Click!");
        JLabel label = new JLabel("Has clickado: " + clickCount + " veces");
        panel.setBackground(Color.pink);
        button.setBackground(Color.white);
        panel.add(button);
        panel.add(label);
        mainFrame.getContentPane().add(panel);

        button.addActionListener(actionEvent -> {
            clickCount++;
            label.setText("Has clickado: " + clickCount + " veces");
        });

    }



}