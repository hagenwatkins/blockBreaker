package com.tiy;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("Block Breaker");

        BlockBreakerPanel panel = new BlockBreakerPanel();
        frame.getContentPane().add(panel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(490,660);
        frame.setResizable(false);
    }
}
