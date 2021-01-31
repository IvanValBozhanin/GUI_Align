package com.company;

import javax.swing.*;
import java.awt.*;

public class Align extends JFrame {
    public Align() {
        JFrame f = new JFrame("Align");

        JCheckBox checkBox1 = new JCheckBox("Snap to Grid");
        JCheckBox checkBox2 = new JCheckBox("Show Grid");
        checkBox1.setBounds(10, 40, 100, 50);
        checkBox2.setBounds(10, 80, 100, 50);

        JLabel x = new JLabel("X:");
        JLabel y = new JLabel("Y:");
        x.setBounds(110, 35, 20, 20);
        y.setBounds(110, 100, 20, 20);

        JTextField xtf = new JTextField();
        JTextField ytf = new JTextField();
        xtf.setBounds(130, 35, 40, 20);
        ytf.setBounds(130, 100, 40, 20);

        JButton ok = new JButton("Ok");
        JButton cancel = new JButton("Cancel");
        JButton help = new JButton("Help");
        ok.setBounds(190, 10, 80, 30);
        cancel.setBounds(190, 70, 80, 30);
        help.setBounds(190, 130, 80, 30);
        {
            f.add(checkBox1);
            f.add(checkBox2);
            f.add(x);
            f.add(y);
            f.add(xtf);
            f.add(ytf);
            f.add(ok);
            f.add(cancel);
            f.add(help);
            f.setSize(300, 200);
            f.setLocationRelativeTo(null);
            f.setLayout(null);
            f.setVisible(true);
        }
    }
}
