import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayouts - course");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 250));
        panel.setBackground(Color.YELLOW);
        panel.setLayout(new FlowLayout());

        JButton button = new JButton("Click me!");
        JButton button2 = new JButton("Click me!");
        JButton button3 = new JButton("Click me!");
        JButton button4 = new JButton("Click me!");
        JButton button5 = new JButton("Click me!");
        JButton button6 = new JButton("Click me!");
        JButton button7 = new JButton("Click me!");

        panel.add(button);      /*or frame.add(new JButton("1"))*/
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);

        frame.add(panel);
        frame.setVisible(true);
    }
}