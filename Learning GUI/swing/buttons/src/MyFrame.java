import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame /*implements ActionListener*/ {
    JButton button;
    JLabel label;
    MyFrame(){
        button = new JButton("Click me, if you can");
        button.setBounds(400,250,300,50);
        //button.addActionListener(this);
        button.addActionListener(e -> {
            System.out.println("How you dare!"); button.setEnabled(false); label.setVisible(true);
        });
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.ITALIC, 20));
        button.setBackground(Color.BLUE);
        button.setForeground(Color.RED);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        //button.setEnabled(false);

        label = new JLabel("Hello there!");
        label.setBounds(200, 500, 300, 100);
        label.setVisible(false);
        label.setFont(new Font("Arial", Font.BOLD,50));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,700);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

   /* @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            System.out.println("How you dare!");
        }
    }*/
}
