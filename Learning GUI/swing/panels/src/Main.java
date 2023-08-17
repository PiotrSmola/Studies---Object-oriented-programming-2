import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panels - course");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 600);
        frame.setVisible(true);

        panel.setBackground(new Color(0xcc6600));
        panel.setBounds(0,0,250,250);
        panel.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 0, Color.BLACK));
        panel.setLayout(new BorderLayout());
        frame.add(panel);
        label.setText("Hello! It's me, first panel");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);

        panel2.setBackground(new Color(0,255,0));
        panel2.setBounds(250,250,250,250);
        panel2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK));
        panel2.setLayout(new BorderLayout());
        frame.add(panel2);
        label2.setText("Hello! It's me, second panel");
        panel2.add(label2);
        label2.setVerticalAlignment(JLabel.BOTTOM);
        label2.setHorizontalAlignment(JLabel.RIGHT);
    }
}