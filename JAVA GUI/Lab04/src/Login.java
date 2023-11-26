import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JDialog {

    private JPanel JPanelLogin;
    private JTextField textFieldEmail;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;
    private JLabel JLabelWelcome;
    private JLabel JLabelLogin;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JLabel JLabelIcon;
    private JLabel JLabelEmail;
    private JLabel JLabelPassword;

    public Login(JFrame parent) {
        super(parent); //skąd to parent
        this.setContentPane(JPanelLogin);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        setLocationRelativeTo(parent); //to samo skąd to

        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = textFieldEmail.getText();
                String password = String.valueOf(passwordField.getPassword());

                user = getAuthUser(email, password);

                if (user != null) {
                    dispose();
                    Dashboard dashboard = new Dashboard();
                    dashboard.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Niepoprawne dane logowania!");
                }

            }
        });
        setVisible(true);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public User user;

    private User getAuthUser(String email, String password) {
        User user = null;
        final String DB_URL = "jdbc:mysql://localhost:3306/mystore";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.name = resultSet.getString("name");
                user.email = resultSet.getString("email");
                user.phone = resultSet.getString("phone");
                user.address = resultSet.getString("address");
                user.password = resultSet.getString("password");
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args) {
        Login login = new Login(null); //dlaczego null
        User user = login.user;
        if (user != null) {
            System.out.println("Zalogowano użytkownika: " + user.name);
            System.out.println("Email: " + user.email);
            System.out.println("Telefon: " + user.phone);
            System.out.println("Adres: " + user.address);
        } else {
            System.out.println("Niepoprawne dane logowania!");
        }
//NIE DZIAŁA POPRAWNIE
    }
}
