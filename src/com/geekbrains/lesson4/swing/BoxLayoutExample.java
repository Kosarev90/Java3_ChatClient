package com.geekbrains.lesson4.swing;

import javax.swing.*;

public class BoxLayoutExample {

    public static void main(String[] args) {
        new MyWindowBox();
    }
}

class MyWindowBox extends JFrame {
    MyWindowBox() {
        setBounds(500, 500, 500, 500);
        setTitle("BoxLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jButtons = new JButton[10];
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // одну из строк надо закомментить
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        for (int i = 0; i < jButtons.length; i++) {
            jButtons[i] = new JButton("#" + i);
            jButtons[i].setAlignmentX(CENTER_ALIGNMENT);
//            jButtons[i].setAlignmentX(RIGHT_ALIGNMENT);
            add(jButtons[i]);
        }
        setVisible(true);
    }
}
