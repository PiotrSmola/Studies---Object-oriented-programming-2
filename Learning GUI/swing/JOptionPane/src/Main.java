import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Some extremely important information","Fancy Title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Some extremely important information","Fancy Title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Some extremely important information","Fancy Title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Some extremely important information","Fancy Title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Some extremely important information","Fancy Title",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Yes or No?", "Confirmation", JOptionPane.YES_NO_OPTION);
        System.out.println(JOptionPane.showConfirmDialog(null, "Yes or No?", "Confirmation", JOptionPane.YES_NO_OPTION));

        int answer = JOptionPane.showConfirmDialog(null, "Yes or No or Cancel?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        String age = JOptionPane.showInputDialog("How old are you?: ");
        System.out.println(age);



    }
}