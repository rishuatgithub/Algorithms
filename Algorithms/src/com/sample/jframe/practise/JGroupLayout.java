package com.sample.jframe.practise;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JGroupLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Group Layout");
		Container contentPanel = frame.getContentPane();
		GroupLayout groupLayout = new GroupLayout(contentPanel);
		
		contentPanel.setLayout(groupLayout);
		
		JLabel label = new JLabel("Click here");
		JButton button = new JButton("Button");
		
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup()
					.addComponent(label)
					.addGap(10,20, 100)
					.addComponent(button)
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(label)
					.addComponent(button)
				);
		
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
