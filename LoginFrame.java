package employeemanagement;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("MotorPH Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(120, 30, 130, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 70, 130, 25);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(90, 110, 100, 30);
        add(loginButton);

        loginButton.addActionListener(e -> validateLogin());
    }

    private void validateLogin() {
        String user = usernameField.getText();
        String pass = new String(passwordField.getPassword());

        try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] creds = line.split(",");
                if (creds.length >= 2 && creds[0].equals(user) && creds[1].equals(pass)) {
                    JOptionPane.showMessageDialog(this, "Login successful!");
                    this.dispose();
                    new MainFrame().setVisible(true);
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Invalid credentials!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading user file.");
        }
    }

    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}