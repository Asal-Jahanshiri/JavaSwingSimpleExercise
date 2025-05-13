package part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickCounterApp extends JFrame implements ActionListener {
    private JLabel counterLabel;
    private JButton clickButton;
    private int count = 0;

    public ClickCounterApp() {
        setTitle("Click Counter");

        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        count ++;
        counterLabel.setText("Clicks: " + count);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClickCounterApp().setVisible(true));
    }
}

