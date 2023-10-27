package WyborSystemu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonSystem extends JFrame {
    private JPanel panel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JLabel JLabelImage;
    private JButton OKButton;
    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("linux.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));
    private ImageIcon iconMaciontosh = new ImageIcon(getClass().getResource("macintosh.png"));

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args) {
        RadioButtonSystem buttonSystem = new RadioButtonSystem();
        buttonSystem.setVisible(true);
    }

    public RadioButtonSystem() {
        super("System selection");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);


        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (linuxRadioButton.isSelected()){
                    JLabelImage.setIcon(resize(iconLinux, 120,120));
                }

            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectOption = "";
                if (linuxRadioButton.isSelected()) selectOption = "Linux";
                if (windowsRadioButton.isSelected()) selectOption = "Windows";
                if (macintoshRadioButton.isSelected()) selectOption = "Macintosh";

                JOptionPane.showMessageDialog(RadioButtonSystem.this, "Wybrano system: " + selectOption);
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (windowsRadioButton.isSelected()){
                    JLabelImage.setIcon(resize(iconWindows, 120,120));
                }
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (macintoshRadioButton.isSelected()){
                    JLabelImage.setIcon(resize(iconMaciontosh, 120,120));
                }
            }
        });
    }
}
