import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLayeredPane - course");
        frame.setSize(new Dimension(1000,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
///////
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,1000,500);
        frame.add(layeredPane);
///////
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.red);
        label.setBounds(100,100,200,200);
        layeredPane.add(label);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.yellow);
        label2.setBounds(150,150,200,200);
        layeredPane.add(label2);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(200,200,200,200);
        layeredPane.add(label3);
        /*better visual option
        layeredPane.add(label3);
        layeredPane.add(label);
        layeredPane.add(label2);*/

    }
}