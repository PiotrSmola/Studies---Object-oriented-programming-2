import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("First swing app - course");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 350);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.blue);
    }
}
