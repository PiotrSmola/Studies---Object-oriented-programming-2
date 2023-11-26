import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Register extends JDialog {
    private JPanel registerPanel;
    private JLabel JLabelIcon;
    private JLabel JLabRegister;
    private JLabel JLabelName;
    private JTextField textFieldName;
    private JLabel JLabelEmail;
    private JTextField textFieldEmail;
    private JLabel JLabelPhone;
    private JTextField textFieldPhone;
    private JLabel JLabelAddress;
    private JTextField textFieldAddress;
    private JLabel JLabelPassword;
    private JPasswordField passwordField;
    private JLabel JLabelConfirm;
    private JPasswordField passwordField1;
    private JButton registerButton;
    private JButton cancelButton;


    public static void main(String[] args) {
        Register register = new Register(null);
        User user = register.user;
        if (user != null){
            System.out.println("Pomyślnie dodano użytkownika: " + user.name);
        } else {
            System.out.println("Nie udało się dodać użytkownika!");
        }
    }

    public Register(JFrame parent) {
        super(parent);
        setTitle("Rejestracja");
        this.setContentPane(registerPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        setMinimumSize(new Dimension(250, 300));
        setModal(true);
        setLocationRelativeTo(parent);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registerUser() {
        String name = textFieldName.getText();
        String email = textFieldEmail.getText();
        String phone = textFieldPhone.getText();
        String address = textFieldAddress.getText();
        String password = String.valueOf(passwordField.getPassword());
        String confirmPassword = String.valueOf(passwordField1.getPassword());

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Wypełnij wszystkie pola!", "Błąd", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Hasła nie są takie same!", "Błąd", JOptionPane.ERROR_MESSAGE);
            return;
        }
        user = addUserToDatabase(name, email, phone, address, password);
        if (user != null) {
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Nie udało się dodać użytkownika!", "Błąd", JOptionPane.ERROR_MESSAGE);
            ;
        }
        ;
    }

    public User user;

    private User addUserToDatabase(String name, String email, String phone, String address, String password) {
        User user = null;
        final String DB_URL = "jdbc:mysql://localhost:3306/mystore";
        final String USERNAME = "root";
        final String PASSWORD = "";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO users (name, email, phone, address, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, password);

            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                user = new User();
                user.name = name;
                user.email = email;
                user.phone = phone;
                user.address = address;
                user.password = password;
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

}
