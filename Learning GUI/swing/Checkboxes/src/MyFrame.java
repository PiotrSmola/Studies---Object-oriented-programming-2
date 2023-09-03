import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton();
    JCheckBox checkBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox("First option", true);
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Calibri", Font.PLAIN,24));
        this.add(checkBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

        }
    }
}
