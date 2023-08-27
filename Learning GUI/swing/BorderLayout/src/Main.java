import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout - course");
        frame.setSize(1000,700);
        frame.setLayout(new BorderLayout(5, 5));
        frame.setVisible(true);
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

        /* ----------------- sub panels ----------------- */

        panel5.setLayout(new BorderLayout());

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.pink);
        panel7.setBackground(Color.cyan);
        panel8.setBackground(Color.yellow);
        panel9.setBackground(Color.orange);
        panel10.setBackground(Color.white);

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.EAST);
        panel5.add(panel8, BorderLayout.SOUTH);
        panel5.add(panel9, BorderLayout.WEST);
        panel5.add(panel10, BorderLayout.CENTER);
        /* ---------------------------------------- */

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);


    }
}