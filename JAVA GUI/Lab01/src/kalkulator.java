import javax.swing.*;

public class kalkulator extends JFrame {
    private JPanel panel1;
    private JButton dodawanie;
    private JButton odejmowanie;
    private JButton mnozenie;
    private JButton dzielenie;
    private JLabel Jheader;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public static void main(String[] args) {
        kalkulator frame = new kalkulator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public kalkulator() {
        super("Kalkulator");
        this.setContentPane(panel1);
    }
}
