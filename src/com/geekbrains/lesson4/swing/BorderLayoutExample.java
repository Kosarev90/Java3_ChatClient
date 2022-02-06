package com.geekbrains.lesson4.swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        new MyWindow();
    }

}

class MyWindow extends JFrame {
    MyWindow() {
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton[] jButtons = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jButtons[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());
        add(jButtons[0], BorderLayout.EAST);
        add(jButtons[1], BorderLayout.WEST);
        add(jButtons[2], BorderLayout.SOUTH);
        add(jButtons[3], BorderLayout.NORTH);
        add(jButtons[4], BorderLayout.CENTER);
        setVisible(true);
    }
}

