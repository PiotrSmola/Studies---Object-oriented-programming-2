import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame /*implements ActionListener*/ {
    JButton button;
    MyFrame(){
        button = new JButton("Click me, if you can");
        button.setBounds(400,250,300,50);
        //button.addActionListener(this);
        button.addActionListener(e -> System.out.println("How you dare!"));
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.ITALIC, 20));
        button.setBackground(Color.BLUE);
        button.setForeground(Color.RED);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        //button.setEnabled(false);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,700);
        this.setVisible(true);
        this.add(button);
    }

   /* @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            System.out.println("How you dare!");
        }
    }*/
}
