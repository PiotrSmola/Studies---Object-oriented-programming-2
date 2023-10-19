package Temperatura;

import javax.swing.*;

public class konwersjaTemperatury extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton konwertujButton;
    private JLabel JHeader;

    public static void main(String[] args) {
        konwersjaTemperatury frame = new konwersjaTemperatury();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public konwersjaTemperatury() {
        super("Konwersja temperatury");
        this.setContentPane(panel1);
        this.pack();
    }
}
