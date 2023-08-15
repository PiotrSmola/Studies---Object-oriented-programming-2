import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("New fancy and creative label");
        Border borders = BorderFactory.createEtchedBorder(Color.red, new Color(0xcc6600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Labels");
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(new Color(0x7F00FF));
        label.setFont(new Font("sylfaen", Font.BOLD,20));
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(borders);



    }
}