package LosowaLiczba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomNumber extends JFrame{
    private JPanel JPanel1;
    private JLabel title;
    private JTextField minNumberTextField;
    private JTextField maxNumberTextField;
    private JButton losujButton;
    private JLabel generatedNumber;

    public static void main(String[] args) {
        RandomNumber frame = new RandomNumber();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public RandomNumber() {
        super("Generowanie losowej liczby");
        this.setContentPane(JPanel1);
        this.pack();

        losujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int min = Integer.parseInt(minNumberTextField.getText());
                int max = Integer.parseInt(maxNumberTextField.getText());
                Random random = new Random();
                int randomNum = (random.nextInt((max - min) + 1) + min);
                generatedNumber.setText(String.valueOf(randomNum));

            }
        });
    }
}
