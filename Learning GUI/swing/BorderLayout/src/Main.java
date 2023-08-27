import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout - course");
        frame.setVisible(true);
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.black);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(200, 100));
        panel2.setPreferredSize(new Dimension(100, 200));
        panel3.setPreferredSize(new Dimension(200, 100));
        panel4.setPreferredSize(new Dimension(100, 200));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);


    }
}