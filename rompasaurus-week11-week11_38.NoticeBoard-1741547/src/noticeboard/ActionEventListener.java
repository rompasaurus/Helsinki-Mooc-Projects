package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {
    private JTextField jtf;
    private JLabel jl;

    public ActionEventListener(JTextField jtf,JLabel jl) {
        this.jtf = jtf;
        this.jl = jl;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.jl.setText(this.jtf.getText());
        this.jtf.setText("");
    }
}
