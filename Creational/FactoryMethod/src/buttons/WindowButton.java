package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowButton implements Button{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello");
        label.setOpaque(true);
        label.setBackground(new Color(235,235,235));
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(300,300);

        onClick();
    }

    @Override
    public void onClick(){
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
