import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panels - course");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 500);
        frame.setVisible(true);

        panel.setBackground(new Color(0xcc6600));
        panel.setBounds(0,0,250,250);
        frame.add(panel);
    }
}