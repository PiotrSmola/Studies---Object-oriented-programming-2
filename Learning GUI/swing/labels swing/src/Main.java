import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("New fancy and creative label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Labels");
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);


    }
}