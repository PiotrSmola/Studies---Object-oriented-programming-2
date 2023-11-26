import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {
    private JPanel boarddash;
    private JPanel JPanelMenu;
    private JPanel JPanelNav;
    private JPanel JPanelList;
    private JButton registerButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JTable table1;
    private JButton closeButton;
    private JScrollPane JScroll;
    private JLabel JLabelLabel;
    private JLabel JLabelIcon;

    private DefaultTableModel model;

    public Dashboard() {
        super("Dashboard");
        this.setContentPane(boarddash);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        table1.setModel(model);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
    }
}

