import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("First swing app - course");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 350);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.blue);
    }
}
