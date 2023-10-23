package Kalkulator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulator extends JFrame {
    private JPanel panel1;
    private JLabel Jheader;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel values;
    private JPanel result;
    private JButton dodawanieButton;
    private JButton odejmowanieButton;
    private JButton mnozenieButton;
    private JButton dzielenieButton;
    private JPanel top;
    public double wynik, a, b;

    public static void main(String[] args) {
        kalkulator frame = new kalkulator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



    public static double dodawanie(double a, double b) {
        return a + b;
    }
    public static double odejmowanie(double a, double b) {
        return a - b;
    }
    public static double mnozenie(double a, double b) {
        return a * b;
    }
    public static double dzielenie(double a, double b) {
        return a / b;
    }

    public kalkulator() {
        super("Kalkulator");
        this.setContentPane(panel1);
        this.pack();

        dodawanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                b = Double.parseDouble(textField2.getText());
                wynik = dodawanie(a, b);
                textField3.setText(String.valueOf(wynik));
            }
        });
        odejmowanieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                b = Double.parseDouble(textField2.getText());
                wynik = odejmowanie(a, b);
                textField3.setText(String.valueOf(wynik));
            }
        });
        mnozenieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                b = Double.parseDouble(textField2.getText());
                wynik = mnozenie(a, b);
                textField3.setText(String.valueOf(wynik));
            }
        });
        dzielenieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                b = Double.parseDouble(textField2.getText());
                wynik = dzielenie(a, b);
                textField3.setText(String.valueOf(wynik));
            }
        });
    }

}
