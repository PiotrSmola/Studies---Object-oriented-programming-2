package Kalkulator;

import javax.swing.*;

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

    public static void main(String[] args) {
        kalkulator frame = new kalkulator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public kalkulator() {
        super("Kalkulator");
        this.setContentPane(panel1);
        this.pack();
    }

}
