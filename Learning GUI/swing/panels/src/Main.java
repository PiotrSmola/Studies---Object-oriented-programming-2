import javax.swing.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panels - course");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 600);
        frame.setVisible(true);

        panel.setBackground(new Color(0xcc6600));
        panel.setBounds(0,0,250,250);
        panel.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 0, Color.BLACK));
        frame.add(panel);

        panel2.setBackground(new Color(0,255,0));
        panel2.setBounds(250,250,250,250);
        panel2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        frame.add(panel2);

        label.setText("Hello! It's me, first panel");
        panel.add(label);
        label.setHorizontalTextPosition(JLabel.CENTER);
    }
}