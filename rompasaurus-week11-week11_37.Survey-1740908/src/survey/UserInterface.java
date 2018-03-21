package survey;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");



        JRadioButton no_reason = new JRadioButton("No reason.");
        JRadioButton because = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(no_reason);
        buttonGroup.add(because);

        JButton done = new JButton("Done!");

        container.add(new JLabel("Are you?"));
        container.add(yes);
        container.add(no);
        container.add(new JLabel("Why?"));
        container.add(no_reason);
        container.add(because);
        container.add(done);

    }


    public JFrame getFrame() {
        return frame;
    }
}
