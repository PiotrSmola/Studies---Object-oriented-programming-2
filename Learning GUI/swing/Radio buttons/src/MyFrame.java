import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton firstButton;
    JRadioButton secondButton;
    JRadioButton thirdButton;
MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        firstButton = new JRadioButton("First");
        secondButton = new JRadioButton("Second");
        thirdButton = new JRadioButton("Third");

        ButtonGroup group = new ButtonGroup();

        group.add(firstButton);
        group.add(secondButton);
        group.add(thirdButton);

        this.add(firstButton);
        this.add(secondButton);
        this.add(thirdButton);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == firstButton) {
            System.out.println("First button clicked");
        } else if (e.getSource() == secondButton) {
            System.out.println("Second button clicked");
        } else if (e.getSource() == thirdButton) {
            System.out.println("Third button clicked");
        }
    }
}
