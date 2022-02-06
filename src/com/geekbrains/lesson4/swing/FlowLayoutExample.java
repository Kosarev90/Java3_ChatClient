package com.geekbrains.lesson4.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {
        new MyWindowFlow();
    }
}

class MyWindowFlow extends JFrame {
    MyWindowFlow() {
        setBounds(500, 500, 500, 500);
        setTitle("FlowLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jButtons = new JButton[10];
        setLayout(new FlowLayout());
        for (int i = 0; i < jButtons.length; i++) {
            jButtons[i] = new JButton("#" + i);
            add(jButtons[i]);
        }
        setVisible(true);
    }
}