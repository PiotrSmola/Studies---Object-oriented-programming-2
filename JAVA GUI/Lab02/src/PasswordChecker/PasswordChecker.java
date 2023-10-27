package PasswordChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChecker extends JFrame{
    private JButton OKButton;
    private JPanel JPanel1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;

    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        passwordChecker.setVisible(true);
    }

    public PasswordChecker() {
        super("Sprawdzanie hasła");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
