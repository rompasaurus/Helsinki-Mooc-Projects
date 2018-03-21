package clicker.ui;

import clicker.applicationlogic.*;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator count = new PersonalCalculator();

    @Override
    public void run() {

        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);

        JLabel counter = new JLabel(count.giveValue()+"");
        JButton click = new JButton("Click!");

        ClickListener clickInvoke = new ClickListener(count,counter);

        click.addActionListener(clickInvoke);

        container.add(counter);
        container.add(click);

    }

    public JFrame getFrame() {
        return frame;
    }
}
