import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayouts - course");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,3,5,5));


        frame.add(new JButton("First button"));
        frame.add(new JButton("Second button"));
        frame.add(new JButton("Third button"));
        frame.add(new JButton("Fourth button"));
        frame.add(new JButton("Fifth button"));
        frame.add(new JButton("Sixth button"));

        frame.setVisible(true);



    }
}