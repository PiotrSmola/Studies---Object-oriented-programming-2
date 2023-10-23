package Temperatura;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class konwersjaTemperatury extends JFrame {
    private JPanel panel1;
    private JTextField JCelsjusz;
    private JTextField JFahrenheit;
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
        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsjusz = Double.parseDouble(JCelsjusz.getText());
                    double fahrenheit = (celsjusz * 1.8) + 32;
                    JFahrenheit.setText(String.valueOf(fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Wprowadź liczbę!");
                }
            }
        });
    }
}
