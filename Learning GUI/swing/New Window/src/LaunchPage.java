import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame("First Window");
    JButton button = new JButton("Click me!");
    LaunchPage(){
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        button.setBounds(200,100,150,50);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            NewWindow newWindow = new NewWindow();
        }
    }
}
