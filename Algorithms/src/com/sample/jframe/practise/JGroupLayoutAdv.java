package com.sample.jframe.practise;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JGroupLayoutAdv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf=new JFrame("Group Layout Adv");
		Container content = jf.getContentPane();
		
		GroupLayout gl = new GroupLayout(content);
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		
		content.setLayout(gl);
		
		JLabel label1 = new JLabel("Label 1 ");
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");

		gl.setHorizontalGroup(
				gl.createSequentialGroup()
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(label1).addComponent(button2))
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(button1))
				);
		gl.setVerticalGroup(
				gl.createSequentialGroup()
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label1).addComponent(button1))
					.addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(button2))
				);
		
		jf.pack();
		jf.setVisible(true);
	}

}
