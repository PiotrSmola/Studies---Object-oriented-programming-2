package Haslo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password extends JFrame{
    private JPanel JPanel1;
    private JTextField textName;
    private JPasswordField passwordField1;
    private JButton buttonLogin;
    private JLabel JLabelOutput;

    public static void main(String[] args) {
        Password password = new Password();
        password.setVisible(true);
    }
    String user = "admin";
    String password = "admin";
    public Password(){
        super("Login panel");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,200);
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textName.getText();
                String userPassword = new String(passwordField1.getPassword());

                if (userInput.equals(user) && userPassword.equals(password)) {
                    JLabelOutput.setText("Zalogowano do systemu");
                }
                else {
                    JLabelOutput.setText("Podano błędne dane. Spróbuj ponownie");
                    textName.setText("");
                    passwordField1.setText("");
                }
            }
        });
    }
}
