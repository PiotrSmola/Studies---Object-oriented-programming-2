import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
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

        //also can change default icon of checkbox to a custom icon

        checkBox = new JCheckBox("First option", true);
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Calibri", Font.PLAIN,24));
        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
