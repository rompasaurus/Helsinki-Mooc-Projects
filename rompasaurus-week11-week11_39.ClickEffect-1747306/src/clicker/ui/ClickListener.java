package clicker.ui;

import clicker.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private Calculator count;
    private JLabel counter;






    public ClickListener(Calculator count, JLabel counter) {
        this.counter = counter;
        this.count = count;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count.increase();
        counter.setText(count.giveValue() + "");
    }
}
