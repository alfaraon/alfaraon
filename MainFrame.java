package employeemanagement;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("MotorPH Employee Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Welcome to MotorPH Employee System!");
        label.setBounds(50, 100, 300, 30);
        add(label);
    }
}