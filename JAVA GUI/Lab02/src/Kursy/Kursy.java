package Kursy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kursy extends JFrame {
    private JPanel panel1;
    private JCheckBox javaCheckBox;
    private JCheckBox csharpCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox pythonCheckBox;
    private JButton OKButton;

    public static void main(String[] args) {
        Kursy kurs = new Kursy();
        kurs.setVisible(true);
    }

    public Kursy() {
        super("Bootcamp");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 200);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float price = 0;
                String message = "";
                if (javaCheckBox.isSelected()) {
                    price += 3500;
                    message += "Java #price 3500PLN\n";
                }
                if (pythonCheckBox.isSelected()) {
                    price += 5000;
                    message += "Python #price 5000PLN\n";
                }
                if (csharpCheckBox.isSelected()) {
                    price += 3000;
                    message += "C# #price 3000PLN\n";
                }
                if (cppCheckBox.isSelected()) {
                    price += 4000;
                    message += "C++ #price 4000PLN\n";
                }
                message += "======================================\n";
                JOptionPane.showMessageDialog(null, message + "Razem: " + ((int) price)+"PLN");
            }
        });
    }
}
