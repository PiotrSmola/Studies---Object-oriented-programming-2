package Data;

import Kalkulator.kalkulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class data extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JLabel label1;
    private JLabel result;


    public static void main(String[] args) {
        data frame = new data();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public data() {
        super("Bieżąca data");
        this.setContentPane(panel1);
        this.pack();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(new Date().toString());
            }
        });
    }
}