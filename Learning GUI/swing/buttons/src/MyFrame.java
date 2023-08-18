import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame /*implements ActionListener*/ {
    JButton button;
    MyFrame(){
        button = new JButton("Click me, if you can");
        button.setBounds(400,250,200,50);
        //button.addActionListener(this);
        button.addActionListener(e -> System.out.println("How you dare!"));

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
