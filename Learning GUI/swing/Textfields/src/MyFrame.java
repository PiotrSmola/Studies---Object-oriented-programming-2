import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Textfields - course");
        this.setLayout(new FlowLayout());

        textField.setPreferredSize(new Dimension(250, 50));
        textField.setFont(new Font("Tahoma", Font.PLAIN,20));
        textField.setForeground(Color.BLUE);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.white);
        textField.setText("Enter your name");
        textField.setEditable(true);
        this.add(textField);

        button.addActionListener(this);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome Mr./Ms. " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
