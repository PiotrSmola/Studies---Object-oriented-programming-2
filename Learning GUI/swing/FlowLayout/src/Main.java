import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayouts - course");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));

        JButton button = new JButton("Click me!");
        JButton button2 = new JButton("Click me!");
        JButton button3 = new JButton("Click me!");
        JButton button4 = new JButton("Click me!");
        JButton button5 = new JButton("Click me!");
        JButton button6 = new JButton("Click me!");
        JButton button7 = new JButton("Click me!");

        frame.add(button);      /*or frame.add(new JButton("1"))*/
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.setVisible(true);
    }
}