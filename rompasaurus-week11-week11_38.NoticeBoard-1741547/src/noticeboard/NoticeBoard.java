package noticeboard;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField topTextField = new JTextField();
        JButton copyButton = new JButton("Copy!");
        JLabel receivingLabel = new JLabel();

        ActionEventListener copyToLabel = new ActionEventListener(topTextField,receivingLabel);
        copyButton.addActionListener(copyToLabel);
        container.add(topTextField);
        container.add(copyButton);
        container.add(receivingLabel);
    }
}
