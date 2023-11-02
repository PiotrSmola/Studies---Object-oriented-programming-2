package PasswordComparison;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class PasswordComparison extends JFrame {
    private JPanel JPanel1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton JButtonOK;
    private boolean match;
    String correctPassword = "codejava";

    public static void main(String[] args) {
        PasswordComparison passwordComparison = new PasswordComparison();
        passwordComparison.setVisible(true);
    }

    public PasswordComparison() {
        super("Porównywanie haseł");

        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        JButtonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password1 = new String(passwordField1.getPassword());
                String password2 = new String(passwordField2.getPassword());
                if (!password1.equals(password2)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match!");
                    match = false;
                } else if (password1.equals(password2) && !password1.equals(correctPassword)) {
                    JOptionPane.showMessageDialog(null, "Wrong password!");
                    match = true;
                } else if (password1.equals(password2) && match == true){
                    JOptionPane.showMessageDialog(null, "Congratulations! You entered correct password!");
                }
            }
        });
    }
}
