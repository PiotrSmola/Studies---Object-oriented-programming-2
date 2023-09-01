import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class NewWindow {
    JFrame newFrame = new JFrame("Second Window");
    JLabel label = new JLabel("Hello!");

    NewWindow(){
        newFrame.setSize(1000,500);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setLayout(null);
        newFrame.setVisible(true);

        label.setBounds(0,0,300,200);
        label.setFont(new Font("Times New Roman", Font.BOLD,25));
        newFrame.add(label);
    }
}
